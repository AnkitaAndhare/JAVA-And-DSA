public class pairs {

    public static void printpairs(int arr[]){
      for(int i=0; i<arr.length; i++){
        int curr = arr[i];
        for(int j=i+1; j<arr.length; j++){
            System.out.print("(" +curr + "," +arr[j] + ")");
        }
        System.out.println();
      }
    }

    public static void subarrays(int arr[]){
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            for( int j=i; j<arr.length; j++){
               for(int k=i; k<j; k++){
                System.out.print(arr[k]);
               }
               ts++;
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray :" + ts);
    }

    public static void max_subarray_sum(int arr[]){
           int currsum = 0;
           int maxsum = Integer.MIN_VALUE;

           for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum = 0;
                for(int k=i; k<=j; k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
           }
           System.out.println(maxsum);
    }


    public static void sum_Prefix_array(int arr[]){
        int currsum;
        int maxsum = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        // Calculate the prefix sums
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Calculate the maximum subarray sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum subarray sum is: " + maxsum);
    }

    public static void kadanes_Algo(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0; i<arr.length; i++ ){
            currsum = currsum + arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);   // updating maxsum
        }
        System.out.println("Max subarray sum is : " + maxsum);
}

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // printpairs(arr);
        // subarrays(arr);
        // max_subarray_sum(arr);
        sum_Prefix_array(arr);
        kadanes_Algo(arr);
    }
}


/*
kadan algo 

+ve + +ve = +ve
+ve + -ve = +ve
+ve small + -ve large  = -ve 
if currsum id -ve then consider it as 0 till we got positive number

*/