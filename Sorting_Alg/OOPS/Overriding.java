public class Overriding {
    public static void main(String[] args) {
        
        Animal A1 = new Animal();
        A1.eat();
        A1.m2();

        Deer d1 = new Deer();
        d1.eat();
       //  d1.m2();   gives error

       Animal A2 = new Deer();
       A2.m2();


    }
}

class  Animal{
    void eat(){
        System.out.println("eats anything");
    }

    protected void m2()
    {
        System.out.println("From parent Animal m2");
    }
}

class Deer extends Animal{
    @Override void eat(){          
        System.out.println("eats grass");
    }

    @Override protected void m2()
    {
        System.out.println("From child deer m2");
    }
}



/*
method overriding occurs when a subclass (child class) has
 the same method as the parent class

 it is not required to use this annotation when overriding a method, 
 it helps to prevent errors. If a method marked with @Override fails to correctly override a method in one of its superclasses, 
 the compiler generates an error.
 */








/*
 Method overriding = run time polymorphism 
 parent and child both contain the same function with a diff definition

version of a method that is executed will be determined by the object that is used to invoke it. 
If an object of a parent class is used to invoke the method,
then the version in the parent class will be executed,
 */