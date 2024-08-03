public class Shortest_Path {
     
    public static float getShortestPath(String path){
      int x=0, y=0;
      
      for(int i=0; i<path.length(); i++){
        char dir = path.charAt(i);

        //south
        if (dir == 'S') {
            y--;
        }

        //North
        else if (dir == 'N') {
            y++;
        }

        //East
        else if (dir == 'E') {
            x++;
        }

        // west
        else{
            x--;
        }
      }

      int X2 = x*x;
      int Y2 = y*y;
      return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("shortest distance: " + getShortestPath(path));
    }
}
