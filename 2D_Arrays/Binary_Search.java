import java.util.*;

public class Binary_Search {
    
    public static int binarySearch(int numbers[], int key){
    int start =0, end = numbers.length-1;

     while (start <= end) {
         int mid = (start + end) / 2;

         // comparisons
         if (numbers[mid] == key) {
             return mid;
         }

         if (numbers[mid] < key) {    // right condition
             start = mid + 1;
         } else {
             end = mid - 1;
         }
         
     }
     return 0;
}
public static void main(String args[]){
    int numbers[]= {2,4,6,8,10,14};
    int key = 11;
    System.out.println("index for key is :" +binarySearch(numbers, key));
}
}