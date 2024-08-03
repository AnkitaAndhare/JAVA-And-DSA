import java.util.Scanner;

public class Clear_ithBit {

    public static int ClearIthBit(int n, int i){

        // left shift of 1 then negation and n
        int bitwise = ~(1 << i);
        return n & bitwise; 
    }

     public static void main(String[] args) {
         System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter bit index you want to change: ");
        int i = sc.nextInt();

        int result = ClearIthBit(n, i);
        System.out.println(result);
     }
}

/*
 n = 10 ith position 1 
  (10) 1010   1 << i(1) = 0010   ~0010=1101

    1010 (10)
    1101 ~(1 << i)       and opration
    ------
    1000 (8)
    

 */
