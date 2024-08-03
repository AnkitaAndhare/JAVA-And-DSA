import java.util.Scanner;

public class LargestNo_matrix {

   public static void PrintMatrix(int matrix[][]){
   
        System.out.println("Matrix is:");
        for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print( matrix[i][j] + " ");
        }
        System.out.println();
    }
    
   }

  /*   if method is void then need to call Largestno(matrix);  in main method it will directly print value in console
  
  public static void Largestno(int matrix[][]) {
    int maxElement = Integer.MIN_VALUE;

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] > maxElement) {
                maxElement = matrix[i][j];
            }
        }
    }
    System.out.println("Largest element in the matrix: " + maxElement);
}

*/

   public static int Largestno(int matrix[][]){

    int maxElement = Integer.MIN_VALUE;

    for(int i=0; i<matrix.length; i++){
        for(int j=0;j<matrix[0].length; j++){
            if (matrix[i][j] > maxElement) {
                maxElement = matrix[i][j];
            }
        }
       
    }
       return maxElement;
}

public static void SmallestNo(int matrix[][]){
    
    int minElement = Integer.MAX_VALUE;

    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if (matrix[i][j] < minElement) {
               minElement = matrix[i][j]; 
            }
        }
     }
     System.out.println("Smallest no in matrix is: " + minElement);

}

     public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no for matrix:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
         PrintMatrix(matrix);
         SmallestNo(matrix);
         
       int maxElement =  Largestno(matrix);
       System.out.println("largest element in the matrix: " + maxElement);
     }
}
