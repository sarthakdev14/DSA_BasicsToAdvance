import java.util.*;
class node {
   int val;
   node next;
   node(int val){
       this.val = val;
   }
}
class MyStack {
    node head;
    int len;


    int peak() {
        if (len == 0) {
            System.out.println("Stack Empty");
            return -1;
        } else {
            return head.val;
        }

    }

    int pop() {

        if (len == 0) {
            System.out.println("Stack Empty");
            return -1;
        } else {
            int top = head.val;
            head = head.next;
            len--;
            return top;
        }

    }

    void push(int element) {
        node temp = new node(element);
        if (len == 0) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int size() {
        return len;
    }

    void display() {
        node temp = head;
        System.out.println();
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

}
    public class P3_ImplementationViaLinkedList {
        public static void main(String[] args) {
            MyStack s = new MyStack();
            s.push(5); s.push(10); s.push(15); s.push(20);
            s.display();
            s.pop();
            s.display();

        }
    }
