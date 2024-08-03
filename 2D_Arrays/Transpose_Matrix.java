public class Transpose_Matrix {

public static void printMatrix(int matrix[][]){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

public static void findTranspose(int matrix[][]){
      
    int transpose[][] = new int[3][3];

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          transpose[j][i] = matrix[i][j];
        }
    }
     // Print the transpose matrix after constructing it
     
    for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
         System.out.print(transpose[i][j] + " ");
        }
    System.out.println();
    }
}



    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        System.out.println("Original matrix:");
         printMatrix(matrix);

        System.out.println("Transpose matrix:");
        findTranspose(matrix);
    }
    
}
