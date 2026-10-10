// LC - 232

// Add Efficient Approach

import java.util.*;

public class P7_ImplementationViaStack {

    static class MyQueue {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void push(int x) {
            st.push(x);
        }

        public int pop() {

            while (st.size() > 1) {
                helper.push(st.pop());
            }

            int front = st.pop();

            while (helper.size() > 0) {
                st.push(helper.pop());
            }

            return front;
        }

        public int peek() {

            while (st.size() > 1) {
                helper.push(st.pop());
            }

            int front = st.peek();

            while (helper.size() > 0) {
                st.push(helper.pop());
            }

            return front;
        }

        public boolean empty() {
            return st.size() == 0;
        }
    }

    public static void main(String[] args) {

    }
}

/*
// LC - 232
// Implement Queue using Stack
// Efficient Pop and Peek Approach

import java.util.*;

public class P7_ImplementationViaStack {

    static class MyQueue {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void push(int x) {

            while (st.size() > 0) {
                helper.push(st.pop());
            }

            st.push(x);

            while (helper.size() > 0) {
                st.push(helper.pop());
            }
        }

        public int pop() {
            return st.pop();
        }

        public int peek() {
            return st.peek();
        }

        public boolean empty() {
            return st.size() == 0;
        }
    }

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.peek());   // 10

        System.out.println(q.pop());    // 10
        System.out.println(q.pop());    // 20

        q.push(40);

        System.out.println(q.peek());   // 30
        System.out.println(q.pop());    // 30
        System.out.println(q.pop());    // 40

        System.out.println(q.empty());  // true
    }
}
 */