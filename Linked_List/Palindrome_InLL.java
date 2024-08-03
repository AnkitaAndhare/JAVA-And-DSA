import java.util.*;
public class Palindrome_InLL {

    public static Node head;
    public static Node tail;
    public static int size;


    public static class Node{
        int data; 
        Node next;
 
        public Node(int data){   //constructor                                                     
            this.data = data;
            this.next = null;
        }
    }
        public static void printlist( Node head){

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();

        }

        // slow fast Approach 
        public Node findMid(Node head){

            if (head == null) {
                return null;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {  // even and odd res
                slow = slow.next;       // +1
                fast = fast.next.next;  //+2
            }
            return slow;  // slow is my midnode 
        }

        public boolean checkPalindrome(){
            if (head == null || head.next == null) {
                return true;
            }
           
            // step 1 find mid
            Node midNode = findMid(head);
            
            // step 2 reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;  // right half head (as prev becomes last node)
            Node left = head;
            
            // step 3 check righ-left part
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;  
        }


// finding ll is cycled or not 
        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null ) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;   // cycle exists
                }
            }

            return false;  // cycle doesn't exists
        }


        // Remove cycle in LL
        public static void removeCycle(){
            // detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            while (fast != null &&  fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }
            if (cycle == false) {
                return;
            }

            // finding next meeting point 
            slow = head;
            Node prev = null;

            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
        // remove cycle -> last.next = null
            prev.next = null;  // last node becomes null
        }
     

        // merge sort 
        public Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow; // mid node
        }

        private Node merge(Node head1, Node head2){
            Node mergeLL = new Node(-1); // dummy node to start 
            Node temp = mergeLL;   // temp poimtimg to mergell
            
            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    temp = temp.next;
                    head1 = head1.next;
                }else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            while (head1 != null) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }

            while (head2 != null) {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }

            return mergeLL.next;  // to remove dummy -1 
        }

        public Node mergeSort(Node head){
            if (head == null || head.next == null) {
                return head;
            }

            // find mid 
            Node mid = getMid(head);

            //left and right MS
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newright = mergeSort(rightHead);

            // merge 
            return merge(newLeft, newright);
        }


        public static void  ZigZag(){

            // find mid 
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next !=null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;  

            // reverse the 2nd half
            Node curr = mid.next; 
            mid.next = null;  // break the LL at mid 
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node leftH = head;  // left head 
            Node rightH = prev;  // right head 

            // alt merge - zig-zag merge
            
            Node nextL, nextR;  // point next of left right head and for storing that value
            while (leftH != null && rightH != null ) {
                nextL=  leftH.next;
                leftH.next = rightH;
                nextR = rightH.next;
                rightH.next = nextL;

                leftH = nextL;
                rightH = nextR;
            }
        }


    public static void main(String[] args) {

        Palindrome_InLL List = new Palindrome_InLL();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        
        System.out.println("Original List: ");
        printlist(head);
        
        System.out.println("checking palindrome : "+List.checkPalindrome());
     
        // second list
        Palindrome_InLL secondList = new Palindrome_InLL();

        // for cyclic list  1->2->3->2
        secondList.head = new Node(1);
        Node temp = new Node(2);
        secondList.head.next = temp;
        secondList.head.next.next = new Node(3);
        secondList.head.next.next.next = temp;

      // Check if second list is cycled
    System.out.println("Checking second list if cycled: " + secondList.isCycle());
    secondList.removeCycle();
    System.out.println("After removing cycle: " +secondList.isCycle());





        // third list
        Palindrome_InLL List3 = new Palindrome_InLL();
        System.out.println("3rd List: ");

        // for cyclic list  1->2->3->2
        List3.head = new Node(5);
        List3.head.next = new Node(4);
        List3.head.next.next = new Node(3);
        List3.head.next.next.next = new Node(2);
        List3.head.next.next.next.next = new Node(1);

        printlist(List3.head);
        List3.head = List3.mergeSort(List3.head);
        printlist(List3.head);

        List3.ZigZag();
        System.out.println("zig-zag list:");
        printlist(List3.head);



        
    }
}


/*
 1221 

 slow - fast concept
 revere half LL

 1 find mid node
 2 reverse 2nd half  (to travel backward reverse is must)
 3 check first half = sec half

 ListNode: This is the return type of the method. It indicates that the method will return a reference to a ListNode object, which represents a node in the linked list. In other words, the method will return the middle node of the linked list as a ListNode

*/