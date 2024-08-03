public class OptimizedRotated_Array {

    // O(n)
    public static void reverse(int num[], int start, int end){
        // start =0; end=num.length;
        while (start < end) {
            
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }

    static void rotate(int []num, int k){
        k = k % num.length;
        if (k < 0) {
            k = k + num.length;
        }

        reverse(num, 0, k-1);  // part 1
        reverse(num, k, num.length-1);  // part 2
        reverse(num, 0, num.length-1);  // whole reverse


    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        rotate(num, 5);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();


    }
}
