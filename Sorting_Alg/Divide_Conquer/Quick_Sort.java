public class Quick_Sort {

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei){
        if (si >= ei) {  // base case
            return;
        }
    
        // let last element is pivot 
       int pIdx =  partition(arr, si, ei);
       quicksort(arr, si, pIdx-1);  // left part of pivot index
       quicksort(arr, pIdx+1, ei);   // right 
    }           

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                 arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp; 
            return i;

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}

/* worst case in asecending and decending O(n^2) when pivot is smallest or largest element
 no extra space like merge O(n)
 avrage (nlogn)
 worst O(n^2)

 PIVOT AND PARTITION 

 1 pivot    random , mid, first, last elements

 2 partition (divide in parts)

 3 call quick sort for left and right part(recursion)
 */