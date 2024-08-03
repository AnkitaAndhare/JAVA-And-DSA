public class Copy_constructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "ankita";
        s1.roll = 33;
        s1.password = "abcd";
        s1.marks = new int []{90,80,100}; // initilization of array 
         // s1.marks[0] = 100;

        Students s2 = new Students(s1);  // s2 will copy the sa object
        s2.password = "xyz";

        s1.marks[2] = 90;     // changed the marks

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Students{
    String name;
    int roll;
    String password;
    int marks[];   // declaration of array

  // shallow copy constructor refrences (changes reflect)
    // Students(Student1 s1){
    //    marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor    (changes does not reflect)

    Students(Students s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
      for(int i=0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
      }
    }


    Students(){
        System.out.println("Constructor is called.....");
        marks = new int[3];
    }

    Students(String name){
    this.name = name;
    marks = new int[3];
    }
}

/*
 copy constructor is a special type of constructor that creates an object using another object of the same Java class. It returns a duplicate copy of an existing object of the class.
 */