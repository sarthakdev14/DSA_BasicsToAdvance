import java.util.*;

public class P8_ImplementingStackViaQueue {

    static class MyStack {

        Queue<Integer> q = new LinkedList<>();

        // Push element onto stack
        public void push(int x) {
            q.add(x);
        }

        // Remove and return top element
        public int pop() {

            int n = q.size();

            // Move first n-1 elements to the back
            for (int i = 1; i <= n - 1; i++) {
                q.add(q.remove());
            }

            // Last element is the stack top
            return q.remove();
        }

        // Return top element
        public int top() {

            int n = q.size();

            // Move first n-1 elements to the back
            for (int i = 1; i <= n - 1; i++) {
                q.add(q.remove());
            }

            // Get the last element
            int ans = q.peek();

            // Put it back because top() should not remove it
            q.add(q.remove());

            return ans;
        }

        // Check if stack is empty
        public boolean empty() {
            return q.size() == 0;
        }
    }

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());    // 30

        System.out.println(st.pop());    // 30
        System.out.println(st.pop());    // 20

        st.push(40);

        System.out.println(st.top());    // 40
        System.out.println(st.pop());    // 40
        System.out.println(st.pop());    // 10

        System.out.println(st.empty());  // true
    }
}