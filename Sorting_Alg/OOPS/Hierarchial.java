// import java .util.*;

public class Hierarchial {
    public static void main(String[] args) {
        
        Fish f1 = new Fish();  // obj creation
        
        f1.color = "grey";      // obj initialization
        f1.fins = 2;
        System.out.println("fish color: " + f1.color);
        System.out.println("fins number: " + f1.fins);

        f1.eat();   // fun call
        f1.swim();

        Birds b1 = new Birds();
        b1.color = "green";
        System.out.println(b1.color);
        b1.breath();
        b1.fly();


    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breath(){
        System.out.println("breath");
    }

}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}

class Birds extends Animal{
    int wings;

    void fly(){
        System.out.println("fly");
    }
}

class mammal extends Animal{
   
    void walk(){
     System.out.println("walk");

 }
}

/*
 Hierarchical Inheritance, one class serves as a 
 superclass (base class) for more than one subclass
 */