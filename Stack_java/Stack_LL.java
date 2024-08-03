import java.util.*;

public class Stack_LL {
    
    static class Node{
        int data;
        Node next;

        Node(int data){       // constructor 
           this.data = data;
           this.next = null;
        }
    }

    static class Stack{
         static Node head = null;

         // isempty
         public static boolean isempty(){
            return head == null;
         }

         //push
         public static void push(int data){
            Node newnode = new Node(data);  // create 
             if (isempty()) {
                head = newnode;
                return;
             }

             newnode.next = head;   
             head = newnode;
         }

         //pop
           public static int pop(){
            if (isempty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isempty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
