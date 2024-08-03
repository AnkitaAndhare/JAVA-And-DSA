
// check if problem can be solved and print only 1 solution to N Queens problem
public class nQueen1 {
    static int count;

    public static boolean isSafe(char board[][], int row, int col){

        // vertically up
       for(int i=row-1; i>=0; i--){
        if (board[i][col] == 'Q') {
            return false;
        }
       }

       // diag left up

       for(int i=row-1 , j=col-1; i>=0 && j>=0; i--, j--){
        if (board[i][j] == 'Q') {
            return false;
        }
       }

        // diag right up
      for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
        if (board[i][j] == 'Q') {
            return false;
        }
      }

       return true;
    }

    public static boolean nQueens(char board[][], int row){

        // base case
        if (row == board.length ) {
           // printBoard(board);
            count++;      // count no of ways of solution
            return true;
        }
    

    // column loop
    for(int j=0; j<board.length; j++){
        if(isSafe(board, row, j)){
        board[row][j] = 'Q';      // place the queen
       
        if(nQueens(board, row+1)){ // recursion call
        return true;
    }
        board[row][j] = 'x';    // backtracking unplace the queen

    }
}
        return false;
    }
    // fun to print board
    public static void printBoard(char board[][]){
        System.out.println("----chess Board----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    
    }

   public static void main(String[] args) {
    int n=4;
    char board [][] = new char[n][n];

   // initialize
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'x';
            System.out.print(board[i][j] +" ");

        }
        System.out.println();
    }
    
    if(nQueens(board, 0)){
        System.out.println("solution is possible");
        printBoard(board);
    }else{
        System.out.println("not possible");
    }
   // System.out.println("total ways to solve n queens: " + count);
   } 


}


