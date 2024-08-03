import java.util.*;

//we r given infinite supply of denomination [1,2,5,10,20,50,100,500,2000]
//find min no of coins/notes to make change for a value V

public class Indians_Coins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }

        System.out.println("total min coins used = " +countOfCoins);
// To print coins used
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}




/*
 A currency system for which the greedy algorithm returns an optimal solution for any value of payment is called a canonical system.

 ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases

 1 sort in desc order
 2  for loop
 while loop
 */