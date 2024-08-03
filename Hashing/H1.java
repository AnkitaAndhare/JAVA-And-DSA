import java.util.*;

public class H1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);

        int population = hm.get("china");
        System.out.println(population);

        System.out.println(hm.get("indonesia"));

        System.out.println(hm.containsKey("india"));

        System.out.println(hm.size());

        hm.clear();
        System.out.println(hm.isEmpty());


    }
}