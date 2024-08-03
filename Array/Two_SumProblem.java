import java.util.*;

public class Two_SumProblem {

    public int[] twosum(int array[], int target){

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){ 
                  if(array[i] + array[j] == target){
                  return new int[]{i, j};
                  }            
                }
            }
        return new int[]{-1, -1};
    }

    public int[] twosum1(int array[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Two_SumProblem sol = new Two_SumProblem();

        int array[] = { 1, 2, 4, 6, 5 };
        int target = 6;

        int[] result = sol.twosum(array, target);
        System.out.println(Arrays.toString(result));

        int[] r = sol.twosum1(array, target);
        System.out.println(Arrays.toString(r));
}
}