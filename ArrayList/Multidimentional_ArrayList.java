import java.util.*;

public class Multidimentional_ArrayList {
   public static void main(String[] args) {
    // list in list mainlist = list + list2 
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    

    mainList.add(list);
    System.out.println(mainList);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    mainList.add(list2);
    System.out.println(mainList);

                                    
    for(int i=0; i<mainList.size(); i++){
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0; j<currList.size(); j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();

    }
   } 
}
