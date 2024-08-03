public class Uppercase {


    // use of StringBuilder is appropriate because you are building a new string by concatenating characters. Using StringBuilder is more efficient than directly concatenating strings using the + operator,
    public static String toUppercase(String str){

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // i start from 1 as we already printed the first lette
        for(int i=1; i<str.length(); i++){
            if (str.charAt(i)== ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am ankita";

        System.out.println(toUppercase(str));
    }
}



/*
public class Uppercase {

    public static String toUppercase(String str) {
        String result = "";

        char ch = Character.toUpperCase(str.charAt(0));
        result += ch;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                result += str.charAt(i);
                i++;
                result += Character.toUpperCase(str.charAt(i));
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hi, i am ankita";

        System.out.println(toUppercase(str));
    }
}

*/
