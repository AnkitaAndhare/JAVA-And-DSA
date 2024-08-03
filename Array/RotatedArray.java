public class RotatedArray {

    //  O(k*n)
    public static void rotateOne(int num[]){   // rotate once

        int temp = num[0];

        for (int i=1; i<num.length; i++){
            num[i-1] = num[i];
        }

        num[num.length-1] = temp;
    }

    public static void rotate(int num[], int k){   

        k = k % num.length;       // 0%5=0  1%5=1 2%5=2 ....5%5=0   6%5=1  no of rotation 
        if (k < 0) {          // for negative value
            k = k + num.length;      // k=-1   -1+5=4     -2+5=3  
        } 

        for (int i=1; i<=k; i++){ 
            rotateOne(num);
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};                                                                        

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
         System.out.println();
        //  rotateOne(num);

         rotate(num, 3);
         for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
