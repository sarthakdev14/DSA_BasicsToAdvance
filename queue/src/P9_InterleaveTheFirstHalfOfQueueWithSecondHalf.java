// GeeksForGeeks
// Using queue
import java.util.*;
// 1 2 3 4 5 6 7 8
// 1 5 2 6 3 7 8 4
public class P9_InterleaveTheFirstHalfOfQueueWithSecondHalf {
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

    public static Queue<Integer> rearrangequeue(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size()/2;
        for( int i = 0 ; i < n ; i++){
           q2.add(q.remove());
        }
        while(q2.size()>0){
            q.add(q2.remove());
            q.add(q.remove());
        }

       return q;
    }
}
