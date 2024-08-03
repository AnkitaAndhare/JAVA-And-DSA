import java.util.*;

public class Strings{
    public static void main(String[] args) {
       char arr[] = {'a', 'b', 'c', 'd'};
       String str =  "abcd";
       String str2 = new String("xyz");

       // Strings are IMMUTABLE
 
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter name:");
    //String name = sc.next(); // only single word 
      String name = sc.nextLine();
      System.out.println(name);

      // length of string
    System.out.println("length of name: " +name.length());

    // concatenation
    String firstname = "Ankita";
    String Lastname = "Andhare";
    String fullname = firstname + " " +Lastname;
    System.out.println(fullname);
    }
}

/*
 If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.
 */