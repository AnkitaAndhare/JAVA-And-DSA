public class Add_inMiddle {
    
    // Instance variables for head and tail of the linked list
    public static Node head;
    public static Node tail;

    // Define a class for the linked list node
    public static class Node {

        int data;
        Node next;

        public Node(int data){  // initialize
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new element to the end of the linked list
    public static void addLast(int data){
        Node newnNode = new Node(data);

        if (head == null) {
            head = tail = newnNode;
        } else{
            tail.next = newnNode;
            tail = newnNode;
        }
}
    
  // Method to insert a new element at the specified index
    public static void Add(int idx, int data){

     Node newNode = new Node(data); // create newnode

     if (idx == 0) {// If index is 0, insert at the beginning
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        return;
     }

     
     Node temp = head;
     int i=0;

        while (i < idx-1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("index out of bound");
            return;
        }
    // i = idx-1;  temp becomes prev of idx
         temp.next = newNode;  // temp to newnode
         newNode.next = temp.next;  // newnode to idx 

         if (temp == tail) { // If inserted at the end, update tail
            tail = newNode;
        }

    }

    public static void printlist(){
       Node temp = head;

       while (temp != null) {
        System.out.print(temp.data);
        temp = temp.next;
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Add_inMiddle ll = new Add_inMiddle();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

      

        Add(2, 9);
        ll.printlist();

    }
}



/*
1 Define a class for the linked list node.
2 Define a class for the linked list itself, which contains methods for adding elements and printing the list.
3 In the main method or elsewhere in your code, create an instance of the linked list class, add elements to it, and then print the list.
 */