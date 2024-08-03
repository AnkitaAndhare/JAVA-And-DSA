public class Interfaces {
    public static void main(String[] args) {
        King k = new King();
        k.moves();

        System.out.println("Maximum moves allowed = " + chessPlayer.Max_Moves);

        chessPlayer.displayMaxMoves();
    }
}

interface chessPlayer{
    int Max_Moves = 50;    // Interface variables must be initialized, and the value cannot be changed.
    void moves();            // by default public hai...abstract fun

    static void displayMaxMoves() {   // interfaces can contain static methods with an implementation.
     System.out.println("moves allowed :" +Max_Moves);
    }

}

 class Queen implements chessPlayer{
     
    public void moves(){
        System.out.println("up, dowun, left, right, diagonal");
    }
}
 
class Rook implements chessPlayer{

    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{

    public void moves(){
        System.out.println("up, down, left, right, diagonal-1 step");
        
    }
}



/*
 When a class implements an interface, it must provide a public implementation for each method in the interface


 Queen class is a non-public (package-private) class because it does not have any access modifier. This means that it can only be accessed by other classes in the same package.
 */


/*
 class is blue print of obj
 Interface is blue print of class 

it implements multiple inheritance  A     B
                                       C

Total Abstraction 100%

1.  All methods are public, abstract & without implementation
2.  Used to achieve total abstraction
3.  Variables in the interface are final(fixed value), public and static(varible create only once)

interface           class

 implements          extends
 */