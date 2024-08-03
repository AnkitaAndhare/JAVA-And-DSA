import java.util.*;

public class Insert_heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // par index

            while (arr.get(x) < arr.get(par)) { // O(logn)

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par; // Update the indices to continue bubbling up
                par = (x - 1) / 2;

            }

        }

        public int peek(){
            return arr.get(0);
        }

        public void printheap() {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(30);
        heap.add(2);

        heap.printheap();
        int min = heap.peek();
        System.out.println("The minimum element : "+min);
    }
}

/*
 * n nodes = logn levels
 * 1 add at last index
 * 2 fix heap
 * 
 * node i
 * left 2i+1
 * right 2i+2
 * 
 * child x parent (x-1) / 2
 * 
 * 
 */