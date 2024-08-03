import java.util.Scanner;

public class Get_ithBit {

    public static int getIthBit(int n, int i){
    // right shift with 1 then and(&) with no.
     int bitmask = 1 >> i;
     if ( (n & bitmask) == 0 ) {
        return 0;
     }else{
        return 1;
     }

// Left shift 1 by i positions and perform bitwise AND with n
// Then right shift the result by i positions to get the value of the ith bit
    // return (n & (1 << i)) >> i;  left shift 


      // return (n >> i) & 1;
    }


    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter bit index: ");
        int i = sc.nextInt();

        int result = getIthBit(n, i);
        System.out.println("Index at " + i + " of " + n + " is: " +result);
    }
    
}


/* 
  15  00001111  we want to find 2nd position bit 
    &        
      00000100  1 << 2 2 bit left shift ie (1 << i)
    -------------
      00000100  not equal to 0
               

n = 15 and i = 2, the binary representation of n is 00001111. After right-shifting by 2 positions, you get 00000011, which is 3 in decimal.

Bitwise AND with 1 ((n >> i) & 1): The result of the right shift operation is then bitwise AND-ed with 1. This operation isolates the rightmost bit of the shifted result.

Example: Continuing from the previous example, (00000011 & 00000001) results in 00000001, which is 1 in decimal.

  
 */