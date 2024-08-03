import java.util.*;   // keys insertion orderd  rest same as hashmap

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> hm = new LinkedHashMap<>();

        hm.put("india",100);
        hm.put("china" , 150);

        System.out.println(hm);

    }
}
