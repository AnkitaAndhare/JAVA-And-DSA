import java.util.*;
public class Duplicate_Parentheses {

    public static boolean isDuplicate(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
        
        // closing
        if (ch == ')' ) {
            int count=0;
            while (s.peek() != '(') {
                s.pop();
                count++;
            }
        if (count < 1) {
            return true;
        }else{
            s.pop();
        }
        // opening 
        }else{
            s.push(ch);
        }
    }
       return false;
    }
    public static void main(String[] args) {
        String str = "(a+b)"; // false means no duplicate
        String str2 = "((a+b))" ;
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
