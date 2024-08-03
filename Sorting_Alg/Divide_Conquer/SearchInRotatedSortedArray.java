/* sorted, rotated array with distinct numners(in ascending order) it is rotated at a pivot point. find the imdex of given element */




public class SearchInRotatedSortedArray {

    public static int SearchIndex(int arr[], int tar, int si, int ei ){

        if (si > ei) {  // base case
            return -1;
        }

        // kaam
        int mid = si +(ei-si)/2;

        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a: left 
            if (arr[si] <= tar && tar <= arr[mid]) {
                return SearchIndex(arr, tar, si, mid);  // recursion
            }else{
                // case b: right
                return SearchIndex(arr, tar, mid+1, ei);
            }
        } // mid on L2
        else{ 
            //case c :right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return SearchIndex(arr, tar, mid+1, ei);
            }else{
                // case d: left
                return SearchIndex(arr, tar, si, mid-1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = SearchIndex(arr, target, 0, arr.length-1);
        System.out.println(target + " is at index " +index);
    }
}















/*
 case 1 = mid on L1     arr[si] <= mid
         case a: L1 left (si=< target <= mid)
         case b: right else
 
 case 2 = mid on L2      mid <= arr[ei]
          case a: L2 right (mid =< target <= ei)
          case b: L2 left else
 */