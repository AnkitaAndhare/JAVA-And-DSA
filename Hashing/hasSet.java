import java.util.*;
public class hasSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        System.out.println(set.size());

        set.remove(2);

        if (set.contains(2)) {
            System.out.println("contains 2"); 
        }
        
        set.clear();

        System.out.println(set.isEmpty());  // true
 

        HashSet<String> cities = new HashSet<>();

        cities.add("mumbai");
        cities.add("pune");
        cities.add("noida");
        cities.add("Bengaluru");

        System.out.println("iterating using iterator");
        Iterator it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("iterating using loop");
        for (String city : cities) {
            System.out.println(city);
        }


    }
}


/* 
no duplicate 
unordered
null is allowed

hashset are implemented by hashmap
linkedhashmap => linkedhashset
treemap => treeset 

add(key)     O(1)
conatinskey  O(1)
remove       O(1)



*/