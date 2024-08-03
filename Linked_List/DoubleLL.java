public class DoubleLL {

    public static Node head;
    public static Node tail;
    public static int size;

    public class Node{
 
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
 
    // Add first element

    public void AddFirst(int data){

        // create new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;   // update head
    }

    

    // Add element at last 
    public void addLast(int data){
        Node newnNode = new Node(data);  // create newnode
        size++;

        if (head == null) {
            head = tail = newnNode;
        }

        tail.next = newnNode;
        newnNode.prev = tail;
        tail = newnNode;
    }

    // Remove first element
    public int removeFirst(){
        if (head == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // remove last 

    public int removeLast(){
        if ( head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
        }

        //  prev = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++){  // or Node prev tail.prev 
            prev = prev.next;
        }

        // Node prev = tail.prev; // Get the node before the current tail

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // reverse the double linked list 
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next; 
            prev = curr;
            curr = next;
        }

        head = prev;
    }


    // print list
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);

        dll.print();
        System.out.println(size);

        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(size);
        
        System.out.print("Reversed linked list : ");
        dll.reverse();
        dll.print();

        dll.removeFirst();
        dll.print();
        System.out.println(size);

        dll.removeLast();
        dll.print();
        System.out.println(size);


    }
}
