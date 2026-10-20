// LC - 503


import java.util.*;

public class P9_NextGreaterElement2 {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            st.push(nums[i]);
        }

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (st.size() > 0 && nums[index] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0)
                nge[index] = -1;
            else
                nge[index] = st.peek();

            st.push(nums[index]);
        }

        return nge;
    }
}