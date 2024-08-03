public class Abstraction {
    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println("initial color:" +h.color); 

        h.changecolor();
        System.out.println("changed color: " +h.color);

        Chicken c = new Chicken();
        c.eat();;
        c.walk();

       //  Animal a = new Animal();  we can't create instance of abstract class 
    }
}

abstract class Animal{
    String color;

    Animal(){    // constructor bydefault every animal(subclass) will have brown color until we change it in it's subclass
     color = "brown";
     System.out.println("Animal class called...");
    }
    
    void eat(){
    System.out.println("animal eats");
    }

    // we give idea to base class not implementation
    abstract void walk(); // it is abstract function... no implementation means every animal will have walk method as per there need  

}

class Horse extends Animal{

    Horse(){
        System.out.println("horse constructor called");
    }

    void changecolor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

// If you need to add an int leg parameter to the walk method in the Chicken class, you should also add the same parameter to the abstract walk method in the Animal

class Chicken extends Animal{

    void changecolor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}




/*
 Hinding all the unnecessary details and showing only the important part to user

 similar to encapsulation 

 DIFF 
 
 encapulation wrapp up the data and function and help to implement data hiding 
 
 Abstraction only show important info hide unnecessary info

 
 ABSTRACT CLASS
1 can not create instance(obj) of abstract class
2 can have abstract / non-abstract methods
3 can have constructors 

 */