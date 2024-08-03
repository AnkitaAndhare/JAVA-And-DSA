import java.util.*;

public class Activity_Selection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0,5,8,5};
        int end[] = {2, 4, 6, 7, 9, 9};  // end time basis sorted

        int maxAct = 0;   // count
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i=0; i<end.length; i++){
            if (start[i] >= lastend) {
                // activity selected
                ans.add(i);
                maxAct++;
                lastend = end[i];
            }
        }

    System.out.println("maximum activity = " + maxAct);
    for(int i=0; i<ans.size(); i++){
        System.out.print("A" +ans.get(i) + " ");
    }
    System.out.println();
    }
}