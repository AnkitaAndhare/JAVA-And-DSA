import java.util.*;

public class Add_in_LL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){  // constructor to initilize the value 
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node  tail;

    public void addFirst(int data ){ // not necessary to be static as we will be calling this method by obj ll and not directy by main method 
   
    // create newnode 
    Node newNode = new Node(data);

    if (head == null) {  // base case 
        head = tail = newNode;
    }

    // make newNode next refer to =  present head
    newNode.next = head;

    // make newNode as haed 
     head = newNode;

     if (tail == null) {
        tail = newNode;
    }
 }


 public void addLast(int data){
    Node newNode = new Node(data);  // create newnode

    if (head == null) {
        head = tail = newNode;
    }

    tail.next = newNode;            // old tail refer to new node
    tail = newNode;                 // assign newnode as tail

 }

public static void print( Add_in_LL ll){
    // if (head == null) {
    //     System.out.println("LL is empty");
    //     return;
    // }

    Node temp = head;

    System.out.print("LinkedList: "); 

    while (temp != null) {
        System.out.print(temp.data +"-> ");  // print data
        temp = temp.next;     // change temp to next node
    }
    System.out.println("null");
 }

   public static void main(String[] args) {
    Add_in_LL ll = new Add_in_LL();



    ll.addFirst(2);

   
    ll.addFirst(1);

    ll.addLast(3);

    ll.addLast(4);
    ll.print(ll);


   } 
}




/*
 Add first node and make if head O(1)

 1 create new node
 2 new node next = head
 3 head = new node 

 base case 
1 head and tail is null \
2 single node= create new node and make it head 


add last 
1 create newnode
2 tail.next = newnode
3 tail = newnode 

base case

 */