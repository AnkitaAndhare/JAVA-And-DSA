public class SortedSearch {   // staircase search 
    // i=row j=col
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while (row >= 0 && col < matrix[0].length) {

            if (matrix[row][col] == key) {
                System.out.println("key found at (" +row+ "," +col+")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static boolean bottomRight(int matrix[][], int key){

        int i=matrix.length-1, j=0;

        while (i < matrix.length && j >= 0) {

            if (matrix[i][j] == key) {
                System.out.println("key found at(" +i+ "," +j+")");
                return true;
            }

            else if (key < matrix[i][j]) {
                i--;
            }
            else {
                j++;
            }
            
        }
         System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, 33);
        bottomRight(matrix, 33);
        
}
}