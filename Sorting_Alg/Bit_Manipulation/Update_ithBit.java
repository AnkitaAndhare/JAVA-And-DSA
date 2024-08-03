import java.util.Scanner;

public class Update_ithBit {

    public static int Clear_ithBit(int n, int i){

        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    public static int Set_ithBit(int n, int i){

        int bitmask = (1 << i);

        return n | bitmask;
    }
     // newbit is 0 or 1 we want update ith position by 0 or 1
    public static int UpdateBit(int n, int i, int newBit){
      if(newBit == 0){
        return Clear_ithBit(n, i);
      }else {
        return Set_ithBit(n, i);
      }

    }
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter bit index you want to change: ");
        int i = sc.nextInt();

       
        int result = UpdateBit(n, i, 1);
        System.out.println(result);
    }
}

/*
10 1010  i=2 
   1110(14)

 */