public class Encapsulation {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.setName("Ankita");
        // s1.getName();
        System.out.println(s1.getName());
    }
}

  class Student2{
    private String name;  //it can only be accessed within the Student2 class and is not directly accessible from outside the class.

    public void setName(String name){
        this.name = name;   // this.name here name is varible in class and = name is arg passed in method
    }

    public String getName(){
        return name;
    }
}


/*
 Encapsulation = uesd to hide data (useless or sensitive data)
 process of wrapping code and data together into a single unit, 
 
 The setName method is a public method that allows external classes (like Encapsulation in this case) to set the value of the private name variable. It enforces encapsulation by controlling how the internal state (in this case, the name variable) is modified.
 
 
 
 
 */