public class Palindrome_String {

    public static boolean isPalindrome(String str){
        int n = str.length();

        for(int i=0; i<n/2; i++){
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "34543";  // noon madam racecar

        System.out.println("Original no: " +str);
       //  isPalindrome(str);

        if(isPalindrome(str)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
