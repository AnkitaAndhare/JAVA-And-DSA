public class Get_Set {
    public static void main(String[] args) {
        pen p1 = new pen();   // obj creation

        p1.getColor();
        p1.setColor("red");   // function call
        p1.setTip(10);

        System.out.println(p1.getColor());  // print the color
        System.out.println(p1.getTip());
        
        p1.setColor("yellow");
        System.out.println(p1.getColor());
}
    
}

// this = keyword used to refer to current object 

class pen{
    private String color;
    private int tip;

    void setColor(String newColor){
     this.color = newColor;
    }
// most common use of the this keyword is to
// eliminate the confusion between class attributes and parameters with the same name
    void setTip(int tip){
        this.tip = tip;
    }

    int getTip(){
        return tip;
    }

    String getColor(){
        return this.color;
    }


}
