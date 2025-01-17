// Monotonic ArrayList(EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.An Array list nums is monotone increasing if for all i<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise

import java.util.*;
public class Q1 {

    public static boolean isMonotone(ArrayList<Integer> list){

      boolean inc = true;
      boolean dec = true;

      for(int i=0; i<list.size()-1; i++){
        if (list.get(i) > list.get(i+1)) {
            inc = false;
        }
        if (list.get(i) < list.get(i+1)) {
            dec = false;
        }
      }

      return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
 
        System.out.println(isMonotone(list));
     }
}
