public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();              // inherited from Animal
        shark.swim();
    }
 
    // it is single level inheritance as only one parent class and one child class is present
}
 class Animal{        // parent class
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
 }

 class fish extends Animal{      // child class extends parent class
    int fins;

    void swim(){
        System.out.println("swim");
    }
 }

/*
 
 mechanism in which one object acquires all the properties and behaviors of a parent object
properties and method of base class are passed on to derived class


Single Inheritance
Multilevel Inheritance
Hierarchical Inheritance
Multiple Inheritance
Hybrid Inheritance
 */