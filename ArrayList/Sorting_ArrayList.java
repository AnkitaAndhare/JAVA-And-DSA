import java.util.*;

// Collections is class & Collection is interface
public class Sorting_ArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(44);
        list.add(4);
        list.add(5);
        list.add(8);

        System.out.println("Original list: " + list);
        Collections.sort(list);
        System.out.println("Sorted List in ascending order: "+ list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        // comparitor = fix logic
        System.out.println(list);
    }
}
