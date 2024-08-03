package Queue;
import java.util.*;

public class JCF_Queue {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();  // queuw is interface so no obj  or ArrayDeque 
       // Queue<Integer> q =new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    
    }
}
