// LC - 1823

import java.util.*;
public class P4_WinnerOfCircularGame {
    public static void main(String[] args) {

    }

    public int findthewinner(int n, int k) {
      Queue<Integer> q = new LinkedList<>();
      for (int i = 0 ; i < q.size() ; i++){
          q.add(i);
      }
      while (q.size()>0){
       // K - 1 Elemnets Remove and Add
          for (int i = 0 ; i < k - 1 ; k++){
              q.add(q.remove());
          }
          q.remove(); // Kth will be removed
      }
      return q.peek();
    }
}