public class NoFrequency {

    public static void printRepeatedNoFreq(int array[]){

        System.out.println("Repeated Numbers with Frequency :");

        for(int i=0; i<array.length; i++){   //  loop iterating all elements except the last one.To avoid ArrayIndexOutOfBoundsException
            int count = 1;

            if (array[i] != -1) {  //repeated elements are marked with -1 to avoid recounting. 
                for(int j=i+1; j<array.length; j++){
                    if (array[i] == array[j]) {
                        count++;

                        array[j] = -1;  // assign -1 for traversed element
                    }
                }
            }
            System.out.println(array[i] + " = " +count);
           /*  if (count > 1) {
                System.out.println(array[i] + " = " +count);
            }*/
        }
    }
    

    public static void printrepeatNofor2D(int matrix[][]){
        System.out.println("Repeated Numbers with Frequency:");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                int x = matrix[i][j];
                
                int count =0;
                if (x == -1)
                 {
                  continue;  
                }
                for(int p=0; p<matrix.length; p++){
                    for(int q=0; q<matrix[0].length; q++){
                        if (x  == matrix[p][q]) {
                            
                            count++;
                            matrix[p][q] = -1;
                        }
                    }
                   
                }
                System.out.println("frequency of " + x + " is :" +count ); 
            }
        }
    }
    public static void main(String[] args) {

        int array[] = {1,2,2,3,3,4,5,6,7,1};
        int matrix[][] = { {1, 2, 3, 4},
                           {5, 2, 2, 8},
                           {9, 10, 11, 12},
                           {1, 13, 14, 15}
                          };
        printRepeatedNoFreq(array);
        printrepeatNofor2D(matrix);
    }
    
}
