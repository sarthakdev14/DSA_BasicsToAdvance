// GeeksForGeeks
// The stock span problem is a financial problem where we have a series of daily price quotes
// for a stock and we need to calculate the span of stock price for all days.
//
// Given an array arr[] representing daily stock prices, the stock span for the i-th day
// is the number of consecutive days up to day i (including day i itself) for which
// the price of the stock is less than or equal to the price on day i.
// Return the span of stock prices for each day in the given sequence.

import java.util.*;

class pair {
    int val;
    int idx;

    pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

public class P10_StockSpan {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> calculateSpan(int[] arr) {

        int length = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        Stack<pair> s = new Stack<>();

        for (int i = 0; i < length; i++) {

            // CHANGE:
            // while(s.size() >= 0) → while(!s.isEmpty() && s.peek().val <= arr[i])
            //
            // We remove all elements which are smaller than or equal to
            // the current element because they cannot be the previous
            // greater element for the current/future elements.
            while (!s.isEmpty() && s.peek().val <= arr[i]) {
                s.pop();
            }

            // CHANGE:
            // If stack is empty, there is no previous greater element.
            // Therefore, the span is i + 1.
            if (s.isEmpty()) {
                a.add(i + 1);
            }

            // CHANGE:
            // If stack is not empty, the top element is the previous
            // greater element.
            // Span = current index - previous greater element's index.
            else {
                a.add(i - s.peek().idx);
            }

            // CHANGE:
            // Push the current element after calculating its span.
            s.push(new pair(arr[i], i));
        }

        return a;
    }
}
//The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days.
//
//Given an array arr[] representing daily stock prices, the stock span for the i-th day is the number of consecutive days up to day i (including day i itself) for which the price of the stock is less than or equal to the price on day i. Return the span of stock prices for each day in the given sequence.
//import java.util.*;
//class pair{
//    int val;
//    int idx;
//    pair(int val , int idx){
//        this.val = val;
//        this.idx = idx;
//    }
//}
//public class P10_StockSpan {
//    public static void main(String[] args) {
//
//    }
//    public ArrayList<Integer> calculateSpan(int[] arr) {
//    int length = arr.length;
//    ArrayList<Integer> a = new ArrayList<>();
//    Stack<pair> s = new Stack<>();
//    for(int i = 0 ; i < length ; i++){
//        while(s.size() >= 0){
//            if(s.peek().val >= arr[i]){
//                a.add(s.peek().idx - i);
//            }
//            if(s.peek().val < arr[i]){
//                s.pop();
//            }
//            if(s.size() == 0){
//                s.push(new pair(arr[i],i));
//            }
//        }
//    }
//    return a;
//    }
//}
