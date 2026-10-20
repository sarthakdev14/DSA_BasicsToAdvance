// LC - 2487
// Remove Nodes From Linked List

import java.util.*;

public class P7_RemoveNodesFromLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        // Put valid nodes into stack
        while (temp != null) {

            if (st.size() == 0) {
                st.push(temp);
            }
            else {

                while (st.size() > 0 && st.peek().val < temp.val) {
                    st.pop();
                }

                st.push(temp);
            }

            temp = temp.next;
        }

        // Rebuild linked list
        temp = null;

        while (st.size() > 0) {

            ListNode top = st.pop();

            if (temp == null) {
                temp = top;
                temp.next = null;
            }
            else {
                top.next = temp;
                temp = top;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        P7_RemoveNodesFromLinkedList obj =
                new P7_RemoveNodesFromLinkedList();

        ListNode result = obj.removeNodes(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}