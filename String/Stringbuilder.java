// memory efficiency increases  
// we are not copying the previous string ....and do changes in string
/*
 * a
 * ab
 * abc
 */
public class Stringbuilder {
   public static void main(String[] args) {
    
    StringBuilder sb = new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb +" ");
    System.out.println(sb.length());
   } 
}


/* 
   sb.toString  convert obj to string

   int a = 10;
   a.toString();  not possible 

   Integer a=10; 
   a.toString();  possible

 */