public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mango"}; // Array of string

        String largest = fruits[0];  // we assume largest is apple
        for(int i=0; i<fruits.length; i++){
            if (largest.compareTo(fruits[i]) <0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}


/*

compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.

if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  

String largest = fruits[0];  // assume largest is the first string
        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i].length() > largest.length()) {
                largest = fruits[i];
            }
        }

*/

