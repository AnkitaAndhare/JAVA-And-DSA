import java.util.Arrays;

public class KthLargestSmallest {

    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int kthSmallest = findKthSmallest(arr, k);
        int kthLargest = findKthLargest(arr, k);

        System.out.println("kth Smallest: " + kthSmallest);
        System.out.println("Kth Largest: " + kthLargest);
    }
}
