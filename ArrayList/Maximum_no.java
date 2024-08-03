import java.util.*;
public class Maximum_no {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(34);

    int max = Integer.MIN_VALUE; //O(n)

    for(int i=0; i<list.size(); i++){
        if (list.get(i) > max) {   // int max = Math.max(max, list.get(i));
            max = list.get(i);
        }
    }

    System.out.println(max);


   } 
}
