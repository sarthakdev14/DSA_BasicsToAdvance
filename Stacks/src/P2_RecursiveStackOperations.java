import java.util.Stack;
// Repeat after revising recursion

public class P2_RecursiveStackOperations {
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
        int x = 51;
      pushAtBottom( s , 50);
      reverseStack(s);
    }

    private static void reverseStack(Stack<Integer> s) {
        if(s.size() <= 1) return ;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    private static void pushAtBottom(Stack<Integer> s, int i) {
        if(s.size() == 0){
            s.push(i);
            return;
        }
        int top = s.pop();
        pushAtBottom(s , i);
        s.push(top);
    }
}

