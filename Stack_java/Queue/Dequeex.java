package Queue;
import java.util.*;

// Dequeue is removing element from queue method

public class Dequeex {    // double ended queue
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.addLast(3);
        System.out.println(deque);

        deque.addLast(4);
        System.out.println(deque);

        System.out.println("first el = " +deque.getFirst());
        System.out.println("last el = " +deque.getLast());


    }
    
}
