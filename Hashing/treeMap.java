import java.util.*;  // keys are sorted
 // put, get, remove are O(logn)

public class treeMap { 
    public static void main(String[] args) {
        
        TreeMap<String, Integer> hm1 = new TreeMap<>();
        hm1.put("India", 100);
        hm1.put("China",150);
        hm1.put("Us", 50);

        System.out.println(hm1);
    }
}
