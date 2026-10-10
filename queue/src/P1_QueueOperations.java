import java.util.*;
public class P1_QueueOperations {
    // Handle Edge Cases Yourself .... ;)

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        display(q);
        addAtIndex(q ,2,60);
        peekQueue(q,3);
        removeQueue(q ,3);
    }

    public static void removeQueue(Queue<Integer> q, int idx) {
        int x = q.size();
        for(int i = 0 ; i < idx ; i++){
            q.add(q.remove());
        }
        System.out.println(q.remove());
        for (int i = 0 ; i < x - idx ; i++){
            q.add(q.remove());
        }
    }

    public static void peekQueue(Queue<Integer> q, int idx) {
      int x = q.size();
      for(int i = 0 ; i < idx ; i++){
          q.add(q.remove());
      }
        System.out.println(q.peek());
      for (int i = 0 ; i < x - idx ; i++){
          q.add(q.remove());
      }
    }


    public static void display(Queue<Integer> q) {
        int x = q.size();
        for(int i = 0 ; i<x ;i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }


    public static void addAtIndex(Queue<Integer> q ,int idx, int value) {
        int x = q.size();
        for(int i = 0 ; i<idx ; i++){
            q.add(q.remove());
        }
        q.add(value);
        for(int i = 0 ; i < x-idx ; i++){
            q.add(q.remove());
        }
        display(q);
    }

}

