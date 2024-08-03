// find and print all subsets of a given String
// n element then 2^n subsets

public class Subset {

     static int count = 0;


    public static void findSubsets(String str, String ans, int i){
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            count ++;
            return;
        }
         
        //recursion
        // yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
        System.out.println(count);

    }
}


/*
 time comp = O(n*2^n)   2^n possible subset * no of n elements
 space = O(n)

 */