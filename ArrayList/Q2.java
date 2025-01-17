import java.util.*;

public class Q2 {

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums){

        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
// It skips the first and last elements because they are checked separately outside of this loop.

for(int i=1; i<nums.size()-1; i++){
    if (nums.get(i-1) +1 < nums.get(i) && nums.get(i) +1 < nums.get(i+1) ) { // This condition checks if the current element (nums.get(i)) is less than the next element by more than 1.
        list.add(nums.get(i));
        
    }
}

    if (nums.size() == 1) {
        list.add(nums.get(0));
    }

    if (nums.size() > 1) {
        if (nums.get(0) +1 < nums.get(1)) {
            list.add(nums.get(0));
        }

        if (nums.get(nums.size()-2) +1 < nums.get(nums.size()-1)) {
           list.add(nums.get(nums.size()-1)) ;
        }
    }
return list;

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        Q2 lp = new Q2();
        ArrayList<Integer> lonelyNumbers = lp.findLonely(nums);

        // Print the result
        System.out.println("Lonely Numbers: " + lonelyNumbers);

    }
}





/*
 Lonely Numbers in ArrayList(MEDIUM)You are given an integer array list nums.A number x is lonely when it appears only once,and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.Return all lonely numbers in nums. You may return the answer in any order

 Sample Input 1: nums = [10,6,5,8]
 Sample Output 1: [10,8]
 Explanation :- 
 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.Hence, the lonely numbers in nums are [10, 8].Note that [8, 10] may also be returned
 */