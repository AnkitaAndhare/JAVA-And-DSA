import java.util.Scanner;
// reverse the given number

public class Reverse_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastdigit = n %10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
     System.out.println(rev);

    
    

    try {
        // Code that may throw different types of exceptions
        String str = null;
        System.out.println(str.length()); // This will throw a NullPointerException
    } catch (NullPointerException e) {
        // Handling NullPointerException
        System.out.println("NullPointerException caught: " + e.getMessage());
    } catch (ArithmeticException e) {
        // Handling ArithmeticException
        System.out.println("ArithmeticException caught: " + e.getMessage());
    } catch (Exception e) {
        // Handling any other type of exception
        System.out.println("Exception caught: " + e.getMessage());
    }

}
}

/*
 n = 10899             rev = (rev * 10) + lastdigit;
                          rev = 0
 Lastdigit = 9            rev = (0 * 10) + 9 = 9
 LD 9                     rev = (9 * 10) + 9 = 99
 Ld 8                     rev = (99 * 10) + 8 = 998
 LD 0                     rev = (998 * 10) + 0 = 9980
 LD 1                     rev = (9980 * 10) + 1 = 99801
 
 */