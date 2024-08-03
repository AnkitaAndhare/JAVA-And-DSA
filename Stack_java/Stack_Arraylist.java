import java.util.*;

public class Stack_Arraylist {

    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
       
       // is empty function 
       public static boolean isEmpty(){   
        return list.size() == 0;
       }

       //push
       public static void push(int data){
        list.add(data);
       }

       // pop
       public static int pop(){
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
       }

       // peek
       public static int peek(){
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
       }
    }


    public static void main(String[] args) {
    
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    
    }
}
/*
  declaring list as static allows it to be accessed from static methods, ensures that it is shared across all instances of the Stack class, and ensures that it is initialized only once.
 */