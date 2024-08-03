public class Permutations {

    static int count = 0;

    public static void findpermutation(String str, String ans){
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            count++;
            return;
        }

        // recursion
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);

            // abcde => "ab" + "de" = "abde"  remove cuurent char once itis added in ans string
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findpermutation(Newstr, ans+curr);
        }

    }


    public static void main(String[] args) {
        String str = "abc";
        findpermutation(str, "");
        System.out.println(count);
    }
}
