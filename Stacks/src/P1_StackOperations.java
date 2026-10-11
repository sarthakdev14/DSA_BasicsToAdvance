import java.util.*;
public class P1_StackOperations {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.push(110);
        s.push(120);
        System.out.println("Display");
        display(s);
        System.out.println();
        System.out.println("Peek at any Index");
        peek(s ,2);
        System.out.println();
        System.out.println("Add at any Index");
        Add(s ,2 , 55);
        display(s);
        System.out.println();
        System.out.println("Remove at any Index");
        Remove(s ,2);
        display(s);
    }

    public static void display(Stack<Integer> s ){
        Stack<Integer> s2 = new Stack<>();
        while(s.size() > 0){
            int top = s.pop();
            System.out.println(top);
            s2.push(top);
        }
        while(s2.size()>0){
            s.push(s2.pop());
        }
    }

    public static void peek (Stack<Integer> s , int idx ){
        Stack<Integer> s2 = new Stack<>();
        while(s.size() > idx + 1){
            s2.push(s.pop());
        }

        System.out.println(s.peek());

        while(s2.size()>0){
            s.push(s2.pop());
        }
    }

    public static void Add (Stack<Integer> s , int idx , int number ){
        Stack<Integer> s2 = new Stack<>();
        while(s.size() > idx){
            s2.push(s.pop());
        }

        s.push(number);

        while(s2.size()>0){
            s.push(s2.pop());
        }
    }


    public static void Remove (Stack<Integer> s , int idx ){
        Stack<Integer> s2 = new Stack<>();
        while(s.size() > idx + 1){
            s2.push(s.pop());
        }

        s.pop();

        while(s2.size()>0){
            s.push(s2.pop());
        }
    }

}
