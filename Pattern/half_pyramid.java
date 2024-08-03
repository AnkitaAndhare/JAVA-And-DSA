public class half_pyramid {

    public void inverted_star(){
           
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void half_pyramid1(){
        int n = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void char_pattern(){
        int n = 4;
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     half_pyramid h = new half_pyramid();

     h.inverted_star();
     h.half_pyramid1();
     h.char_pattern();
    }
}


/*
 
i = 1    j = 1
i = 1    j =2    2 < 1 false so netline
i = 2    j = 1 2 3 (condition false  j <= i)   
i = 3    j = 1 2 3  4( no)
*/