public class Stringbulder1 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        sb.charAt(0);
        System.out.println(sb);

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 4);  // non exclusive means 4 but it take it as 3
        System.out.println(sb);

        sb.append("a");   // sb.append('hello') only one char we can attch at the end of previous string
        System.out.println(sb);  

// replace method used to replace all occurrences of the character 'a' with an empty string,
        String str = "Ankita Andhare".replace("a", "");
        System.out.println(str);
    }
}
