public class Interface_Ex {
    public static void main(String[] args) {
        
        Beer b = new Beer();
        b.herbs();
        b.meet();
    }
}

interface Herbivores{
     void herbs();
}

interface Carnivores{
    void meet();
}


class Beer implements Herbivores, Carnivores{
    public void herbs(){
        System.out.println("eats grass");
    }

    public void meet(){
        System.out.println("eats meet");
    }
}