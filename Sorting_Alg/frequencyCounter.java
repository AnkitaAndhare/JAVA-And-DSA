public class frequencyCounter {

    public static void findFrequency(int[] arr){
    for(int i=0; i<arr.length; i++){
        if (arr[i] == -1) {
            continue;
        }
     
        int count =1;

    for(int j=i+1; j<arr.length; j++){
        if (arr[i] == arr[j]) {
            count++;
            arr[j] = -1;
        }
    }

    System.out.println("Element " + arr[i] + " occures " +count+ " times");
}

    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,3,6,3,6,7,8,93,4};
         findFrequency(arr);
       
}
}