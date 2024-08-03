public class Access_Modifier {
    public static void main(String[] args) {
        
        Bankaccount b1 = new Bankaccount();
        b1.username = "Ankita Andhare";
        System.out.println(b1.username);
       // b1.password = "1234"; we can't assign it directly as it is private
    
        b1.setpassword("abcd");
        System.out.println(b1.getPassword());
    }
}

class Bankaccount{
    String username;
    private String password;

  void setpassword(String pwd){
    password = pwd;
}
    
  String getPassword(){
    return password;

}
}

/*
 
Access_Modifier    within class    within package   outsite package by subclass only     outside package

private               yes             no                       no                            no

default               yes             yes                      no                            no

protected             yes             yes                     yes                            no    

public                yes             yes                     yes                            yes

In the context of Java access modifiers, the order of decreasing visibility is:

public (most permissive)
default (package-private)
protected
private (least permissive)


If the superclass method is public:
The overridden method in the subclass can be public.
The overridden method in the subclass can be protected.
The overridden method in the subclass can be default (package-private).
The overridden method in the subclass cannot be private.

*/