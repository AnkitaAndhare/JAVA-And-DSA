public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
       int startrow = 0;
       int startCol = 0;
       int endRow = matrix.length-1;
       int endCol = matrix[0].length-1;
       
       while (startrow <= endRow && startCol <= endCol) {
        
        // top row is constant col is variable 
        for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startrow][j]+ " ");
        }

        // right endcol is fixed row is variable 
        for(int i=startrow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+ " ");
        }

        // bottom endrow is fixed col is variable
        for(int j=endCol-1; j>=startCol; j-- ){
            if (startrow==endRow) {
                break;
            }
            System.out.print(matrix[endRow][j]+ " ");
        }
        // left 
        for(int i=0; i>=startrow; i--){
            if (startCol == endCol) {
                break;  
            }
           System.out.print(matrix[i][startCol]+ " "); 
        }
         startCol++;
         startrow++;
         endCol--;
         endRow--;

       }
       System.out.println();
}
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                           {13, 14, 15, 16}};
         printSpiral(matrix);
        }
}
