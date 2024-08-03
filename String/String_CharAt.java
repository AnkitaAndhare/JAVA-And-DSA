import java.util.Scanner;

public class String_CharAt {
    // printing all letters
    public static void printletters(String name){
    for(int i=0; i<name.length(); i++){
    System.out.print(name.charAt(i)+" ");
    }
    System.out.println();    

}
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");

        String name = sc.nextLine();
        System.out.println("name is:" +name);

        System.out.println(name.charAt(1));
       
        printletters(name);
        
    }
    
}
