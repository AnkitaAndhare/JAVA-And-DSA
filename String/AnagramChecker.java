import java.util.*;

public class AnagramChecker {
    
    public static boolean areAnagrams(String str1, String str2){
    if (str1.length() != str2.length()) {
        return false;
    }
    
    // convert string to char arrays
    char charArray1[] = str1.toCharArray();
    char charArray2[] = str2.toCharArray();

    Arrays.sort(charArray1);  // sorting in ascending orders 
    Arrays.sort(charArray2);
    
    // check same elements in the same order.
    return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String args[]){
        String s1 = "listen";  // s1 s2 string object
        String s2 = "silent";


    if ( areAnagrams(s1, s2)) {
       System.out.println(s1 +" and " +s2+ " are anargrams "); 
    } else{
        System.out.println("not anagrams");
    }
    }
}
