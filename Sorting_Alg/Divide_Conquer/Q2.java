// brute force approch  O(n^2)
public class Q2 {

    public static int majorityElement(int arr[]){

        int majorityCount = arr.length/2;

        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if (arr[j] == arr[i]) {
                    count += 1;
                }
            }

            if (count >= majorityCount) {
                return arr[i];
  
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement(arr));
   }
}























/*
 Given an array nums of size n, return the majority element.The majority element is the element that appears more than⌊n/2⌋ times.You may assume that the majority element always exists in the array.

 Sample Input 1: nums = [3,2,3]
 Sample Output 1: 3
 Sample Input 2: nums = [2,2,1,1,1,2,2]
 Sample Output 2: 2
 
 Constraints(extra Conditions):
 ●n == nums.length
 ●1 <= n <= 5 * 104
 ●-109 <= nums[i] <= 109
 */