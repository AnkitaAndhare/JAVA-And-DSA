// Time Complexity: O(N2)
// Auxiliary Space: O(1)      gfg  large elements come to the end of array by swapping with adjacent elements


public class bubblesort{

    /*public static void sorting(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            for(int j=0; j<=arr.length-2-turn; j++){  // or < length-1
                if (arr[j] > arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }*/

   /*  public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");  
        }
    }*/


    public static void bubblesorting(int arr[], int n){
    
        for(int i=0; i<n-1; i++){  // turn or pass
            int swap = 0;
        for(int j=0; j<n-i-1; j++){ // for itration
               
            if(arr[j] > arr[j+1]){
                
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1]= temp;

               swap++;
               }
        }
        System.out.println("swap in pass " +(i+1) + " = " +swap);

        if (swap == 0) {
            break;
        }
     }
    }
     
    public static void printarray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 1, 3, 2};
         int n = arr.length;
             
             bubblesorting(arr, n);
             System.out.println("Sorted array: ");
             printarray(arr, n);

             // sorting(arr);
             // print(arr);
             // int len = arr.length;
             // System.out.println("array length" + len);

    }
}