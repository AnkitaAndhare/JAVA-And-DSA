import java.util.*;

public class Palindrome_in_LL {

   public static class Node{
        int data;
        Node next;

      public  Node(int data){
          this.data = data;
          this.next = null;
        }
    }

    static boolean ispalindrome(Node head){

        Node temp = head;
        boolean ispalin = true;

        Stack<Integer> s = new Stack<>();

        while (temp != null) { // push all data
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null) {    
            int i = s.pop();
            if (head.data == i) {
                ispalin = true;
            }else{
                ispalin = false;
                break;
            }

            head = head.next;
        }

         return ispalin;
    }

    static void printList(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node one = new Node(1); 
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five= new Node(3);
        Node six= new Node(2);
        Node seven = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next= seven;

        boolean result = ispalindrome(one);
        System.out.println("isPalindrome: " +result);
        printList(one);
    }
}











/*
 Palindrome Linked List We have a singly linked list of characters write a function that returns true if the given list is a palindrome, else false.
 Input: A->B->C->B->A
 Output: Yes It is Palindrome
 */