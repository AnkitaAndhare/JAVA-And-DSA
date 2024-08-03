import java.util.HashMap;
import java.util.Set;

import javax.naming.ldap.HasControls;

public class iteration_on_hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china",150);
        hm.put("Us", 50);
        hm.put("indonesia", 6);
        hm.put("Nepal", 5);

        // Iteration
        // hm.entrySet      
        Set<String> keys = hm.keySet();
        System.out.println(keys);


        for (String k: keys) {
            System.out.println("Key=" +k+ ",Value=" +hm.get(k));
        }
    }
}
