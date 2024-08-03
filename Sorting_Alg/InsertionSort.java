// pick an element (from unsorted part) and placed in the right pos in sorted part  


public class InsertionSort {
      
    void sort(int arr[]){
        int n = arr.length;
        
        for(int i=1; i<n; i++){
          int curr = arr[i];
          int prev = i-1;

         // finding out current pos to insert 
          while (prev >=0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
          }
           // insertion
           arr[prev+1] = curr;
        }
    }

    void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    
    public static void main(String args[]){
       int arr[] = {12, 11, 13, 5, 6};
      
       InsertionSort ob = new InsertionSort();
       ob.sort(arr);
       ob.printarray(arr);
    
    }
}



/*
 Initially, the array is: {12, 11, 13, 5, 6}.

Iteration 1 (i = 1):

curr = 11, prev = 0.
Since arr[prev] (12) > curr (11), arr[prev+1] = arr[prev], which results in {12, 12, 13, 5, 6}.
Decrement prev, prev = -1.
Insert curr at prev+1 position, arr[prev+1] = curr, resulting in {11, 12, 13, 5, 6}.
 */