package Queue;

public class Queue_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){           // Constructor
          this.data = data;
          this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

    // add
    public static void add(int data){
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // remove
    public static int remove(){
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        int front = head.data;
        
        if (tail == head) {      // single element 
            tail = head = null;
        } else{
            head = head.next;
        }

        return front;
    }

    // peek

    public static int peek(){
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return head.data;
    }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

    //    System.out.println(q.remove());   // remove 1 element
       System.out.println(q.peek());  // return head first elements

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
