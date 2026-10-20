// LC - 682

import java.util.Stack;

public class P6_BaseBallGame {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        int x = operations.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= x; i++) {
            if (operations[i].equals("+")) {
                int prev = s.pop();
                int prev_2 = s.pop();
                int add = prev_2 + prev;
                s.push(prev_2);
                s.push(prev);
                s.push(add);

            } else if (operations[i].equals("D")) { // .equals when comparing with a string to an int
                s.push(2 * s.peek());

            } else if (operations[i].equals("C")) {
                s.pop();
            } else {
                String v = operations[i];
                int m = Integer.parseInt(v);
                s.push(m);
            }
        }

        int sum = 0;
        while (!s.isEmpty()) { // Don't make mistake in while loop conditions

            sum = sum + s.pop();
        }
        return sum;
    }

}
