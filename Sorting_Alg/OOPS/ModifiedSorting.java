public class ModifiedSorting {
public static void modifiedBubbleSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        boolean swapped = false;
        for(int j=0; j<arr.length-1-i; j++){
            if (arr[j] > arr[j+1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }

        }
        if ( swapped == false) {
            break;
        }

    }
   
}

public static void printarray(int arr[]){
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
}

public static void main(String[] args) {
    int arr[] = {2,4,6,56,4};
    modifiedBubbleSort(arr);
    printarray(arr);
}
}