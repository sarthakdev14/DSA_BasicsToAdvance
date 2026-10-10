import java.util.*;

public class P5_ImplementationViaLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MyQueue {
        Node head;
        Node tail;
        int size;

        // Add element to queue
        void add(int val) {
            Node temp = new Node(val);

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        // Remove element from queue
        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front = head.data;
            head = head.next;
            size--;

            return front;
        }

        // Get front element
        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            return head.data;
        }

        // Check if queue is empty
        boolean isEmpty() {
            return size == 0;
        }

        // Get size
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}