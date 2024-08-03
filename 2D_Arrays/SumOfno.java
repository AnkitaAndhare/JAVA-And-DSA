public class SumOfno {

    public static void sum(int nums[][]){
       int sum =0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
               sum +=nums[i][j]; 
            }     
        }
        System.out.println("sum is:" +sum);
    }

    public static void SumofRows(int nums[][]){
     for(int i=0; i<nums.length; i++){
        int rowsum = 0;
        for(int j=0; j<nums[0].length; j++){
            rowsum += nums[i][j];
        }
        System.out.println("sum of element in row " +(i + 1) + ": " +rowsum);

    }
    }

    public static void sumOfColumns(int nums[][]) {
        for (int j = 0; j < nums[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < nums.length; i++) {
                colSum += nums[i][j];
            }
            System.out.println("Sum of elements in column " + (j + 1) + ": " + colSum);
        }
    }


    public static void secondrowsum(int nums[][]){

        int sum =0;

         // Assuming the array has at least 2 row
          if (nums.length >=2) {
            //The loop condition should be based on the number of columns in the second row (nums[1].length), not the number of rows. 
            for(int i=0; i<nums[1].length; i++){ // first row num[0].length and nums[0][i]
             sum += nums[1][i]; //column specified by i
            }
        }
        System.out.println("second row element sum is:" +sum);

    }
       public static void sumOfSecondColumn(int nums[][]){
        int sum = 0;

       
         for(int i=0; i<nums.length; i++){
             sum += nums[i][1];
         }
         System.out.println("sum of second col:" +sum);
       }
    
    public static void main(String[] args) {
        int nums[][] = { {1,4,9},
                        {11,4,3},
                        {2,2,5} };
        System.out.println("length is:" +nums.length);
        System.out.println("length is:" +nums[0].length);

        sum(nums); 
        secondrowsum(nums); 
        sumOfSecondColumn(nums); 
        SumofRows(nums);   
        sumOfColumns(nums);              
    }
}

