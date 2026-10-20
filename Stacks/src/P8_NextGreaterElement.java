// GeeksForGeeks
// Q: Next Greater Element
// Given an array, find the next greater element for every element.
// If no greater element exists, return -1.
//
// Example:
// Input:  [1, 3, 2, 4]
// Output: [3, 4, 4, -1]

import java.util.*;

public class P8_NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;

        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Start from the right side
        st.push(arr[n - 1]);

        nge[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(nge[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};

        ArrayList<Integer> ans = nextLargerElement(arr);

        System.out.println(ans);
    }
}