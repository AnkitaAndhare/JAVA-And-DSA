import java.util.*;

public class Matrices{

    public static boolean Search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                if(matrix[i][j]== key){
                    System.out.println("found the cell (" + i +", "+ j +")");
                    return true;
                } 
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String args[]){
        int matrix [][] = new int [3][3];
        int n= matrix.length, m=matrix[0].length; // n = 3, m =3


        Scanner sc = new Scanner(System.in);
        System.out.println("enter nos for 3*3 matrix :");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                matrix[i][j]= sc.nextInt();
            
            }
        }

        // output

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
                    System.out.println();
                }
                Search(matrix, 5);
    }

}