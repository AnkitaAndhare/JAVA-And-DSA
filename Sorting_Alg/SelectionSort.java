
// pick the smallest put it at the beginning 

public class SelectionSort {

    public static void selectionsorting(int arr[]){
        
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[minPos] > arr[j]){ // for decreasing order change the sign to <
                minPos = j;
            }
            }  // outside loop swaping
           
            // Swap the found minimum element with the first
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionsorting(arr);
        printarray(arr);

    
    }
}
