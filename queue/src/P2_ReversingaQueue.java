import java.util.*;
public class P2_ReversingaQueue {
    public static void main(String[] args) {

    }
    public Queue<Integer> reversequeue (Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (q.size()>0){
            s.push(q.remove());
        }
        while (s.size()>0){
            q.add(s.pop());
        }
        return q;
    }

}
