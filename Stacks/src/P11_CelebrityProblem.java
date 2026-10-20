// GeeksForGeeks

import java.util.*;

public class P11_CelebrityProblem {

    public static void main(String[] args) {

    }

    public int celebrity(int mat[][]) {

        int n = mat.length;

        Stack<Integer> st = new Stack<>();

        // Put all people into the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Eliminate people until only one candidate remains
        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            // If a knows b, then a cannot be a celebrity
            // because a knows someone.
            if (mat[a][b] == 1) {

                st.push(b);

            } else {

                // If a does NOT know b, then b cannot be a celebrity
                // because the celebrity should be known by everyone.
                st.push(a);
            }
        }

        // If stack is empty, no celebrity exists
        if (st.size() == 0) {
            return -1;
        }

        // The remaining person is our potential celebrity
        int celeb = st.pop();

        // Check whether celebrity knows anyone
        for (int j = 0; j < n; j++) {

            // A celebrity should not know anyone except themselves
            if (j == celeb) {
                continue;
            }

            if (mat[celeb][j] == 1) {
                return -1;
            }
        }

        // Check whether everyone knows the celebrity
        for (int i = 0; i < n; i++) {

            // Don't check the celebrity against themselves
            if (i == celeb) {
                continue;
            }

            if (mat[i][celeb] == 0) {
                return -1;
            }
        }

        return celeb;
    }
}