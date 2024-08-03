
public class Q2_Divide_Conquer {

    public static int countInRange(int[] nums, int num, int lo, int hi){
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i] == num) {
                count++;
            }
        }
          return count;
    }

    private static int majorityElementRec(int nums[], int lo, int hi){
        // base case 
        if (lo == hi) {
            return nums[lo];
        }

        int mid = lo + (hi - lo) /2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

//if the two halves agree on the majorityelement, return it
        if (left == right) {
            return left;
        }

//otherwise, count each element and returnthe "winner.
       int leftCount = countInRange(nums, left, lo, hi);
       int rightCount = countInRange(nums, right, lo, hi);

//the ternary operator return leftCount > rightCount ? left : right; returns the element which has a greater count of occurrences between left and right. If the count of occurrences of left is greater, then left is returned; otherwise, right is returned
       return leftCount > rightCount ? left : right;

    }
    public static void main(String[] args) {
      int nums[] = {2, 2, 1, 1, 1, 2, 2};  
    //   int result = countInRange(nums, 1, 0, nums.length);
    //   System.out.println(result); 
      System.out.println(majorityElementRec(nums, 0, nums.length-1));
    }

}
