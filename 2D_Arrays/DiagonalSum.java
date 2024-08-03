public class DiagonalSum {
    // o(n2)
    public static int digonalsum(int matrix[][]){
  int sum = 0;

  for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[0].length; j++){
        if (i == j) {
            sum += matrix[i][j];
            }
            else if(i+j == matrix.length-1){  // i+j = n-1
                sum += matrix[i][j];
            }
    }
  }
  return sum;
    }
    // o(n) time complexity
    public static void optimizcode(int matrix[][]){
        int sum =0;
        for(int i=0; i<matrix.length; i++){
            // primary diagonal  i==j
            sum+= matrix[i][i];

            // secondary matrix i+j = n-1
            if(i != matrix.length-1-i)
            sum+= matrix[i][matrix.length-i-1];// j = n-1-i
        }
        System.out.println("optimized code sum:" +sum);
    }

  public static void main(String args[]){
      int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
    System.out.println("Digonal sum is: " + digonalsum(matrix));
    optimizcode(matrix);
  }  
}
