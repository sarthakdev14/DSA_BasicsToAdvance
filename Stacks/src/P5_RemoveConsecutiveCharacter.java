//GeeksForGeeks
// LC - 1047 SAME SAA HAIN
import java.util.*;
public class P5_RemoveConsecutiveCharacter {
    public static String removePair(String s) {
        Stack<Character> ss = new Stack<>();
        ss.push(s.charAt(0));
        for(int i = 1 ; i< s.length() ; i++){
            if(!ss.isEmpty() &&  s.charAt(i) == ss.peek()) {
                ss.pop();
            }else{
                ss.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(ss.size() != 0){
            sb.append(ss.pop());
        }
        sb.reverse();
        String shorted = sb.toString();
    return shorted;
    }
    public static void main(String[] args) {
     String sss = "aaabbbdddefffeeeddggcdw";
        System.out.println(removePair(sss));

    }
}
