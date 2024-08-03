import java.util.Scanner;

public class Reverse_String {
    
    public static String ReverseString(String inputString){
        StringBuilder sb = new StringBuilder(inputString);

        sb.reverse();
         
      // Converting the StringBuilder back to a String
        String convert = sb.toString();

        return convert;  // return fun 
    }

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

        // Function part 

        System.out.print("Enter a string: ");
        
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String result = ReverseString(inputString);
        System.out.println("reversed string: " +result);
    }
}
