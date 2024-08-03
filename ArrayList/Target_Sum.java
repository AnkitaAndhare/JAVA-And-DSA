import java.util.*;

//  find if any pair in a sorted Arraylist has a target sum
public class Target_Sum {

    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     int count = 0;
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
             
    //          if (list.get(i) + list.get(j) == target) {                System.out.println("Pair: (" + list.get(i) + ", " + list.get(j) + ")");
    //         // System.out.println("Pair: (" + list.get(i) + ", " + list.get(j) + ")");

    //         return true;                            
    //         }

    //        // count++;
    //         }
    //     }
       
    //     //System.out.println("Total pairs:" + count);
    //     return false;
    // }


    // 2 pointer approch
    public static boolean pairSum1(ArrayList<Integer> list, int target){

        int lp = 0; // index
        int rp = list.size()-1;

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }else{
                rp--;  // index
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum1(list, 5));
    }
}



/*
 
case 1 (lp numb + rp numb == target){
    return true;
}

case 2:
 (lp numb + rp numb < target){
    lp++;
}

case 3:
 (lp numb + rp numb > target){
    rp--;
    
}
 */