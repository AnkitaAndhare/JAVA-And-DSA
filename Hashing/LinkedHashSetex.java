import java.util.*;

public class LinkedHashSetex {
    public static void main(String[] args) {
       LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("mumbai");
        cities.add("pune");
        cities.add("noida");
        cities.add("Bengaluru");

        System.out.println(cities); //[mumbai, pune, noida, Bengaluru]

        cities.remove("mumbai");
        System.out.println(cities);  //[pune, noida, Bengaluru]

    }
}



/*
 ordered using doubly linked list 


 */