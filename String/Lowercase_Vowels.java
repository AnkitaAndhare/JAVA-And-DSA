import java.util.Scanner;

public class Lowercase_Vowels {

    public static int countlowercaseVowels(String str){
      
    
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        return count;
    }
    
        
       /*   || oprator 
       
       int count=0;
        for(int i=0; i<str.length(); i++){
            char currentchar = str.charAt(i);
            if (currentchar == 'a' || currentchar == 'e' || currentchar =='i' || currentchar == 'o' || currentchar == 'e') {
              count++;  
            }
        }
        return count;
    }
    */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int vowelcount = countlowercaseVowels(str);

        System.out.println("no of lowercase vowels in string: " + vowelcount);
}
    
}
