public class multilevel_inheritance {
    public static void main(String[] args) {
        dog dobby = new dog();

        dobby.eat();
        dobby.breath();

        dobby.leg = 4;
        System.out.println(dobby.leg);
    }

}

class Animal{     // parent class
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

class mammal extends Animal{    // child class and parent of dog
    int leg;

}

class dog extends mammal{         // child class
    String breed; 

}

/*Multilevel Inheritance, a derived class will be inheriting a base class,
 and as well as the derived class also acts as the base class for other classes


*/











