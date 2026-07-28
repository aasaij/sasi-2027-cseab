//Program to implement N Queen problem
public class NQueen
{
    private static boolean isSafe(int[][] board, int row, int col){
        //checking whether the queen is already placed in the same row of left side
        //if so return false
        for(int i = 0; i<col; i++)
            if (board[row][i]==1) return false;
        //checking whether the queen is already placed in the upper left diagonal
        //if so return false
        for (int r = row, c = col; r>= 0 && c>=0; r--, c--)
            if (board[r][c] == 1) return false;
        //checking whether the queen is already placed in the lower left diagonal
        //if so return false            
        for (int r = row, c = col; r<board.length && c>=0; r++,c--)
            if (board[r][c]==1) return false;
        //None of those conditions not satisfied returns true
        return true;
    }
    private static boolean placeQueens(int[][] board, int col){
        //Base case
        if (col>=board.length)
            return true;
        for (int row = 0; row<board.length; row++){
            if (isSafe(board,row, col)){
                board[row][col] = 1;
                if (placeQueens(board,col+1))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }
    
    private static void printBoard(int[][] board){
        for (int row = 0; row<board.length; row++){
            for (int col = 0; col<board[row].length; col++)
                System.out.print(board[row][col] + " ");
            System.out.println();
        }
    }
   
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int[][] board = new int[n][n];
		if (placeQueens(board, 0))
		    printBoard(board);
		else
		    System.out.println("Solution not found!");
	}
}
