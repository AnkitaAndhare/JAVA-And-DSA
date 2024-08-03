public class SubString {

    public static String subString(String str, int si, int ei){
        String substr = " "; // empty string to store substring

        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
  public static void main(String[] args) {
    String str = "helloworld";
    System.out.println(str.substring(0,5));
    System.out.println(subString(str, 0, 6));
  }  
}
