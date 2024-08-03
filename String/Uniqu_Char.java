public class Uniqu_Char {

    public static void printDistinctCharacters(String input){
        boolean seen[] = new boolean[256];
        
        //For each character c in the character array representation of the input string, do the following."
    //    for(char c : input.toCharArray()){
      
    //     if (!seen[c]) {
    //         System.out.println(c);

    //         seen[c] = true;
    //     }

    //    }

    for(int i=0; i<input.length(); i++){
        char ch = input.charAt(i);

        if(!seen[ch]){
            System.out.print(ch);
            
            seen[ch] = true;
        }
    }
    }

    public static void main(String[] args) {
        String input  = "aaabcdeb";

        System.out.print("Distinct Characters: ");
        printDistinctCharacters(input);

    }
}
