import java.util.Queue;
import java.util.*;

public class P3_ReverseFirst_K_Elements {
    public static void main(String[] args) {

    }

    public Queue<Integer> reversequeue (Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();
        while (k > 0){
            s.push(q.remove());
            k--;
        }
        while (s.size()>0){
            q.add(s.pop());
        }
        for(int i = 0 ; i < q.size() - k ; i++){
            q.add(q.remove());
        }
        return q;
    }
}
