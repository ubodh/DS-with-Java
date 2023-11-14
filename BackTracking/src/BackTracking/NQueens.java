package BackTracking;

public class NQueens {

	public static void placeNQueens(int n) {
		int board[][]=new int[n][n];
		placeQueens(n,0);
	}
	private static void placeQueens(int n, int row) {
		// TODO Auto-generated method stub
		if(row==n) {
			// valid board configuration
		}
		//check for all colums
		// check if 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		placeNQueens(4);
	}

}
