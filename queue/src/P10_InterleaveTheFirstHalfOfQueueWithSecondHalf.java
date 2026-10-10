// GeeksForGeeks
// Using Stack

import java.util.*;

// 1 2 3 4 5 6 7 8
// 1 5 2 6 3 7 4 8

public class P10_InterleaveTheFirstHalfOfQueueWithSecondHalf {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        q = rearrangequeue(q);

        System.out.println(q);
    }

    public static Queue<Integer> rearrangequeue(Queue<Integer> q) {

        Stack<Integer> st = new Stack<>();

        int n = q.size();

        // Put first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Put them back into queue in reverse order
        while (st.size() > 0) {
            q.add(st.pop());
        }

        // Put first half into stack again
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Interleave
        while (st.size() > 0) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // Reverse the queue
        while (q.size() > 0) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }

        return q;
    }
}