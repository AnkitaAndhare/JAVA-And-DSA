// Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY)Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}Sample Output 1: arr = { "earth", "mars", "mercury","sun"


public class Q1 {  // lo=low index hi= high index

    public static String[] mergesort(String arr[], int lo, int hi){
       if (lo == hi) {
        String[] A = { arr[lo] };    // base case
        return A;
       }

       int mid = lo +(hi-lo)/2;
       String [] arr1 = mergesort(arr, lo, mid); // left part
       String [] arr2 = mergesort(arr, mid+1, hi); // right
       return merge(arr1, arr2); 
    }

    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;

        String [] arr3 = new String[m+n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
            }
            return arr3;
    }

    static boolean isAlphabeticallySmaller(String str1, String str2){
        if (str1.compareTo(str2) < 0){
            return true;
        }
       
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String [] sortedArr = mergesort(arr, 0, arr.length-1);

        for(int i=0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }

    }
}





/*
 This conditional statement checks if the low index (lo) is equal to the high index (hi). If they are equal, it means there is only one element in the current subarray.

In such a case, the method creates a new array A containing only that single element from the original array arr. It directly assigns the value of arr[lo] to A.
 */