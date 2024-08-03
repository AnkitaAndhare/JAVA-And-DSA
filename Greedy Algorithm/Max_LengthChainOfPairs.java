import java.util.*;

  public class Max_LengthChainOfPairs {
    public static void main(String[] args) {
      int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}}; 
      
      Arrays.sort(pairs, Comparator.comparingDouble((o -> o[1])) );

      int chainlen = 1;
      int chainend = pairs[0][1]; // last selected pair end or chian end

      for(int i=0; i<pairs.length; i++){
        if(pairs[i][0] > chainend){       //next pair starting element should be greater than chainend last el 
          chainlen++;
          chainend = pairs[i][1];
        }
      }

      System.out.println("Maximum lenght of pair =" +chainlen );
    }
}

/*
 sort acc to sec no 
 select 1st pair
 next pair start > last selecetd end 
 */