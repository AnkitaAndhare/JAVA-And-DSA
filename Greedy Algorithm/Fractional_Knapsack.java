import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        // 2D array to sort ratio according to original index
        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascending order 2D array sorting ...labda fun = short form of fun...sort acc
        // to o[1] col no 1
        // comparator is interface for sorting java obj
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for (int i = ratio.length; i >= 0; i--) {
            int idx = (int) ratio[i][0];   // idx as first col
            if (capacity >= weight[idx]) {
                finalVal = finalVal + val[idx];
                capacity = capacity - weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println(finalVal);
    }
}
