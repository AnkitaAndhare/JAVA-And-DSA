public class Rat_Maze {

    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j =0; j<sol.length; j++){
                System.out.print(sol[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static  boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("solution doesn't exist");
            return false;
        }

         printSolution(sol);
         return true;
    }

    // F check if the current cell is safe to move
    public static boolean isSafe(int maze[][], int x, int y){
     // Check if the current cell is within the maze boundaries and is open (1)
     return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y] ==1);
    }


    // recusive fun 
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]){
  
     // base case
    // if current cell is destination cell and xy is 1 as valid move 
    if (x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1) {
        sol[x][y] = 1;
        return true;
    }

  // check if current cell is valid and safe to move
  if (isSafe (maze, x, y) == true) {
    if (sol[x][y] == 1)  // cell is already 1 so return false
        return false;
    sol[x][y] =1;     // if not 1 then make it 1

    // recusive call 
    if (solveMazeUtil(maze, x+1, y, sol))  
       return true; 

    if (solveMazeUtil(maze, x, y+1, sol)) 
       return true;

    sol[x][y] = 0;  // no sol so backtrack by making it 0 or not visited
    return false;  
    
  }
  return false;
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        solveMaze(maze);
    }
}
