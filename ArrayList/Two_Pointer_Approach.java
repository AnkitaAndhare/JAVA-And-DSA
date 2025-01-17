import java.util.*;

public class Two_Pointer_Approach {

    public static int storedWater(ArrayList<Integer> height){
       // O(n)
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp < rp) {
            int ht = Math.min(height.get(rp), height.get(lp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }

        }
        return maxWater;
    }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println(storedWater(height));
  }  
}
