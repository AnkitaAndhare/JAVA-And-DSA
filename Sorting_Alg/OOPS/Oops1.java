public class Oops1 {

  
        public static void main(String[] args) {
            Pen1 p1 = new Pen1();    // p1 obj of class pen  heap me store hoga
            p1.setColor("blue");
            System.out.println(p1.color);
    
            p1.setTip(4);
            System.out.println(p1.tip);
    
            // Student s1 = new Student();                    // object creation
            // s1.calculatePer(10, 10, 10);     // function call
            // System.out.println(s1.percentage);              // printing the ans 
        }
      
    }
    
    class Pen1{
        String color;
        int tip;
    
        void setColor(String newcolor){
          color = newcolor;
        }
    
        void setTip(int newtip){
            tip = newtip;
        }
    }
    
    // class Student{
    //     String name;
    //     int age;
    //     float percentage;
    
    //     void calculatePer(int phy, int chem, int math){
    //        percentage = (phy + chem + math) / 3;
    //     }
    // }
    
    
    
    
    
    /*
     class capital firstletter function = small
     object = Entities in real world
     Classes =  group of entities   blueprint of object
    
     object have = properties(attributes) and function(behaviours)
    
     (pen) class = properties (color of pen) + fun (change_color)
    
    
    
      */
    

