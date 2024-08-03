public class Polymorphism {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,1));
        
        System.out.println(calc.sum((float)1.5,(float) 1.5));
        System.out.println(calc.sum(10, 10, 10));
    }
}

class Calculator{
    
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum(float a, float b){
        return a+b;
    }
}






/*
 
// many forms 

Compile time polymorphism or Static
method overloading
multiple fun with same name but diff parameter

Run time polymorphism or dynamic
method overriding



 */