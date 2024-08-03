import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {
        // java class String/ Float/ Boolean Starting letter capitl
        // Arraylist is class =  new Arraylist<>() constructor
        // similar to vector in c++
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1, 9); // O(n)
        System.out.println(list);


        // To get element at any index  O(1)
        int element = list.get(2);
        System.out.println(element);

        // Remove elements O(n)
        list.remove(2);
        System.out.println(list);

        //Set elements at index O(n)
         list.set(2, 10);
         System.out.println(list);

         // Contains elements exist or not
         System.out.println(list.contains(12));
         System.out.println(list.contains(2));

         System.out.println(list.size());  //method 

         // print the arrysList
         for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
         }
        System.out.println();

    }
}