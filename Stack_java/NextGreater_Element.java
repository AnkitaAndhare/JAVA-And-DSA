import java.util.*;
public class NextGreater_Element {

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println( );
    }

    public static  void nextgreater_nestedloop(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int nextgreater = -1;
            for(int j=i+1; j<n; j++){
                if (arr[j] > arr[i]) {
                    nextgreater = arr[j];
                    break;
                }
            }
            System.out.print(nextgreater +" ");
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        // printarray(arr);
        // nextgreater_nestedloop(arr);

        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            // 1 while
          while (!s.isEmpty() && arr[s.peek()] <= arr[i])  {
            s.pop();
          }

            // 2 if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            // 3 push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] +" ");
        }

    }
}

// next greater right   
// next greater left    given ques
// next smaller right   cond reverse
// next smaller left   loop reverse cond reverse