import java.util.*;
public class Print_reverse {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Number: ");
    int n = sc.nextInt();

    System.out.print("Reverse num: ");
    while (n > 0) {
        int lastdigit = n % 10;
        System.out.print(lastdigit);
        n = n/10;
    }
     System.out.println();

}


}











/*
 10899 99801

 to get last digit = num % 10
 to remove last no = num / 10
 */