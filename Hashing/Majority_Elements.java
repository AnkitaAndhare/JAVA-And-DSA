import java.util.*; // used in frequency counting problem  (num, freq)-> map

public class Majority_Elements {

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);  //(num, freq)
            }else{
                hm.put(nums[i], 1);
            }
        }

        Set<Integer> keyset = hm.keySet();
        for(Integer key : keyset){
            if (hm.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }
}