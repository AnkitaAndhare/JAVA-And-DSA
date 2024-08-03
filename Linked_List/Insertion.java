public class Insertion {

    public static Node head;
    public static Node tail;
    public static int size;

 public static class Node{

    int data;
    Node next;

    public Node(int data){    // constructor to initialize
      this.data = data;
      this.next = null;
    }
}

 public  void AddFirst(int data){
   // create
    Node newNode = new Node(data);
    size++;

    if (head == null) {
        head = tail = newNode;
    }

    //newnode.next refer to head(old)
    newNode.next = head;

    //update head
     head = newNode;

 }

 public  void addLast(int data){

    Node newnNode = new Node(data);
    size++;

    if (head == null) {
        head=tail=newnNode;
    }
    tail.next = newnNode;
    tail = newnNode;

 }

 public  void printlist(){  // O(n)
    // if (head == null) {
    //     System.out.println("Empty linkedlist");
    //     return;
    // }

    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
 }

public void add(int idx, int data){
    if (idx == 0) {
        AddFirst(data);
        return;
    }

    Node newnNode = new Node(data);
    size++;

    Node temp = head;
    int i=0;

    while (i < idx-1) {
        temp = temp.next;
        i++;
    }

    newnNode.next = temp.next;
    temp.next = newnNode;
}
    
// Remove First 
public int removeFirst(){
    if (size == 0) {
        System.out.println("linked list is empty");
        return Integer.MIN_VALUE;
    }else if (size == 1) {
        int val = head.data;  // deleted node value
        head = tail = null;
        size = 0;
        return val;
    }
         
   int val = head.data;
   head = head.next;
   size--;
   return val; 
}

// Remove Last
public int removeLast(){

    if (size == 0) {
        System.out.println("empty list");
        return Integer.MIN_VALUE;
    } else if (size == 1) {
        int val = head.data;
        head = tail = null;
        return val;
    }

    // prev : 1 = size-2
    Node prev = head;
    for(int i=0; i<size-2; i++){
        prev = prev.next;
    }
    int val = prev.next.data; // deleted tail data 
    prev.next = null;
    tail = prev;
    size--;
    return val;
}

// iterative search to find key in ll  
public static int itrSearch(int key){  // O(n)

    Node temp = head;
    int i=0;

    while (temp != null) {
        if (temp.data == key) {  //key found  
            return i;
        }
        temp = temp.next;
        i++;
    }

    //key not found
    return -1;
}
// Recursive key search 
//O(n)
public static int helper(Node head, int key){  // actual recursion fun

    if (head == null) {
        return -1;
    }

    if (head.data == key) {
        return 0;
    }

    int idx = helper(head.next, key);
    if (idx == -1) {
        return -1;
    }
    return idx+1;   // original head wiil add 1 as index

}
public static int recSearch(int key){
    return helper(head, key);
}

// reverse th ll 3 varible and 4 steps
public static void reverse(){   //O(n)
    Node prev = null;   // for first head prev will be null
    Node curr = head;
    Node next;
    
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    head = prev;
}


// Nth place delete
public static void deleteNthFromEnd(int n){

    // calculate size
    int size =0;
    Node temp = head;
    while (temp != null) {
        temp = temp.next;
        size++;
    }

    if (n == size) {
        head = head.next;   // removefirst
        return;
    }

    //size-n
    int indexToRemove = size-n;

    Node prev = head;
    for(int i=1; i<indexToRemove; i++){  //if i=0 then idextoremove = size-n-1 
        prev = prev.next;
    }

    prev.next = prev.next.next;
    return;

}


    public static void main(String[] args) {
        Insertion ll = new Insertion();

        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.addLast(4);
        ll.addLast(5);

         ll.add(2, 3);   //add in 3 at index 2

        ll.printlist();
        System.out.println("linked list size: " +ll.size);
       
        // ll.removeFirst();
        // ll.printlist();

        // ll.removeLast();
        // ll.printlist();
        // System.out.println("linked list size: " +ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(recSearch(2));

        ll.reverse();
        ll.printlist();

        ll.deleteNthFromEnd(3);
        ll.printlist();

    }
}
