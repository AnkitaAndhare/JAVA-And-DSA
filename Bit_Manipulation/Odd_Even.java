import java.util.*;
public class Odd_Even {

    public static void oddOrEven(int n){
     
        // int bitmask = 1;
        if ((n & 1) == 0) {
            System.out.println(n + " is even number");
        }else{
            System.out.println(n + " is odd number");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);

    }
}
/* 0 0 = 0    1 = 001
   0 1 = 0    3 = 011
   1 0 = 0    5 = 101
   1 1 = 1    7 = 111 all odd no have 1 at LSB in binary no 

 n & 0 = 0 whole no will become 0 we wnat LSB no remain as it is
 n & 1 = 
ex  011 (3)      100 (4)
  & 001 (1)    & 001 (1)
  -------      -------
    001  odd     000 even 
 */
