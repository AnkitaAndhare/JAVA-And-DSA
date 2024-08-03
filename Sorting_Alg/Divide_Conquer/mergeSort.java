//package Divide_Conquer;

public class mergeSort {

    public static void mergesort(int arr[], int si, int ei){
    if (si >= ei) { // base case
        return;
    }

    int mid = si + (ei - si)/2;
    mergesort(arr, si, mid);  // left part
    mergesort(arr, mid+1, ei);// right part
    merge(arr, si, mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si; // idx for 1st sorted part
        int j = mid +1; //idx for 2nd sorted part
        int k = 0; // inx for temp
        
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
            
        }

        // for leftover element of 2st sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
    for(k=0, i=si; k<temp.length; k++, i++){
        arr[i] = temp[k];
    }

    }
    public static void printarr(int arr[])
    {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -2};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);

    }
}





/* O (nlogn)  it take extra spaceO(n) // depth first 
 1 DIVIDE 
 mid index = si +(ei - si) /2 

 2 MERGESORT(LEGT)
   MERGESORT(RIGHT)  RECURSION 

3 TO MERGE LEFT RIGHT 
 */