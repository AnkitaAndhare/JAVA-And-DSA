import java.util.PriorityQueue;

public class PQ_To_Array_Iteration {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(15);
        queue.add(30);
        queue.add(20);
        queue.add(5);
        queue.add(25);

        System.out.println("The PriorityQueue: " +queue);

        Object[] arr = queue.toArray();

        System.out.print("The array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}