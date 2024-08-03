public class Constructors {
    public static void main(String[] args) {
// once we have created multiple constructor then we have to create defualt constructor otherwise bellow line give error
// or delete all constructor to remove error

         Student s1 = new Student();
         Student s2 = new Student("Ankita");
         Student s3 = new Student(59);

         System.out.println(s1.name);
         System.out.println(s1.roll);

         System.out.println(s2.name);
         System.out.println(s2.roll);

         System.out.println(s3.name);
         System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){            // Non-parameterized constructor
    System.out.println("constructor is called...");
    }

    Student(String name){  // parameterized constructor
    this.name = name;      
    }

    Student(int roll){
        this.roll = roll;
    }
}

/*
Constructor in java is used to create the instance of the class.

 Constructor overloading :
 when we create object then automatically sutaible constructor is get called then it is constructor overloading


 */



/*

in java deafult constructor is always there. but we can't initilize it so we create it separatly
 
Constructor is special method which is invoked automatically at time of object creation

1.  it has same name as class or structure
2.  Don't have return type (NOT EVEN VOID)
3.  Only called Once at obj creation
4.  Memory allocation happens when constructor is called

*/