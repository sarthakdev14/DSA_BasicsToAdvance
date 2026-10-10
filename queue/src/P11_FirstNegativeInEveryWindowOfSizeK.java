// GeeksForGeeks

import java.util.*;

// Total Windows = Length - k + 1

public class P11_FirstNegativeInEveryWindowOfSizeK {

    public static void main(String[] args) {

        int arr[] = {12, -1, -7, 8, -15, 30, 16};

        int k = 3;

        List<Integer> ans = FirstNegInt(arr, k);

        System.out.println(ans);
    }

    static List<Integer> FirstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        Queue<Integer> q = new LinkedList<>();

        // Store indices of negative elements
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0)
                q.add(i);
        }

        // Traverse every window
        for (int i = 0; i < n - k + 1; i++) {

            // Remove negative elements outside current window
            while (q.size() > 0 && q.peek() < i)
                q.remove();

            // Check if negative element exists in current window
            if (q.size() > 0 && q.peek() < i + k) {
                ans.add(arr[q.peek()]);
            } else {
                ans.add(0);
            }
        }

        return ans;
    }
}