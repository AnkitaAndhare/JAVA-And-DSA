import java.util.Arrays;   // n logn 
//import java.util.*;
import java.util.Collections;

public class InbuiltSort {  //O(nlogn) 

  public static void printarray(Integer arr[] ){
    for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
    }
}
    public static void main(String[] args) {
        //int arr[] = {5,4,3,2,1};
        Integer arr[] = {5,4,2,3,1};

        // Arrays.sort(arr);  only ascending order
        //Arrays.sort(arr, 0, 3);
        Arrays.sort(arr,0,3, Collections.reverseOrder()); // reverse order fun only works on obj
        printarray(arr);
    }
}
