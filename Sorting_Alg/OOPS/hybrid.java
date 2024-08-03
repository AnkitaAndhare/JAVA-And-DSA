public abstract class hybrid {
    public static void main(String[] args) {
       
       peacock p1 = new peacock();
       p1.color = "green" ;
       System.out.println(p1.color);

       p1.weight = 5;
       System.out.println(p1.weight);

       p1.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
}
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class shark extends Fish{
    int gillslits;
}

class peacock extends Bird{
    int weight;
}