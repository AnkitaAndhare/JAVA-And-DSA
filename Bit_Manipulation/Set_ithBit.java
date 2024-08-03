import java.util.Scanner;

public class Set_ithBit {

    public static int SetIthBit(int n, int i){
     // left shift with 1 then or with no 
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter bit index you want to change: ");
        int i = sc.nextInt();
        
        int result = SetIthBit(n, i);
        System.out.println(result);
    }
    
}



/*
 number  1010       set 1 on 2nd position '
 left shift of 0001 by 2 is 0100 then do and ope with number 

   1010
   0100
   ----
   1110  we have added 1 in number(1010) in 2nd position

   n | (1 << i)



 */