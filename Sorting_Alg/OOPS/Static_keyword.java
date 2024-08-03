public class Static_keyword {
    public static void main(String[] args) {

        Student s1 = new Student();
         
         s1.schoolName = "Jai Hind";
         s1.name = "Ankita";
         System.out.println("s1 school name is " +s1.schoolName);
         System.out.println(s1.name);
         
         Student.change();
         System.out.println(Student.schoolName);

         Student s2 = new Student();
         System.out.println("s2 school name is " + s2.schoolName);
// we have not assigned any schoolname to s2 still is printing beacuese of static word         
        
        Student s3 = new Student();
        s1.schoolName = "ABC";      // we are setting this value explicitly
        System.out.println(s3.schoolName);

    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    static void change(){
        schoolName = "XYZ";
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name; 
    }
}















/*
 
Static keyword in java is used to share the same variable or method of a given class

1 properties
2 function
3 blocks   in bet{} code 
4 nested classes   class in class 

static variable gets memory only once
It makes your program memory efficient (i.e., it saves memory).

 Keep in mind that changing the static variable in one instance affects all instances, but if you want different values for each instance, you should set them explicitly.
 */