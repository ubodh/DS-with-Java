package BackTracking;
public class RateMazeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[][]= {{1,1,0},{1,1,0},{1,1,1}};
           boolean pathPossible=ratInMaze(arr);
           System.out.println(pathPossible);
           solveMaze11(arr);
	}

	private static boolean ratInMaze(int[][] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int path[][]=new int[n][n];
		return solveMaze(0 , 0, arr,path);
	}

	private static boolean solveMaze(int i, int j, int[][] arr, int[][] path) {
		// TODO Auto-generated method stub
		//check if i,j cell is valid or not
		int n=arr.length;
		if(i<0 || i>=n || j<0 || j>=n || arr[i][j]==0 || path[i][j]==1) {
			return false;
		}
		//include the cell in current path
		path[i][j]=1;
		//Destination cell
		if(i==n-1 && j==n-1 ) {
		for(int r=0;r<n;r++) {
			for(int c=0;c<n;c++) {
				System.out.print(path[r][c]+" ");
			}
			System.out.println();
		}
			return true;
		}
		// include the cell in current path
		//top
		if(solveMaze(i-1,j,arr,path)) {
			return true;
		}
		// right
		if(solveMaze(i,j+1,arr,path)) {
			return true;
		}
		//Down
		if(solveMaze(i+1,j,arr,path)) {
			return true;
		}
		//left
		if(solveMaze(i,j-1,arr,path)) {
			return true;
		}
		return false;
	}
	public static void solveMaze11(int arr[][]) {
		int n=arr.length;
		int path[][]=new int[n][n];
		solveMaze1(0,0,arr,path);
	}
	private static void  solveMaze1(int i, int j, int[][] arr, int[][] path) {
		// TODO Auto-generated method stub
		//check if i,j cell is valid or not
		int n=arr.length;
		if(i<0 || i>=n || j<0 || j>=n || arr[i][j]==0 || path[i][j]==1) {
			return ;
		}
		//include the cell in current path
		path[i][j]=1;
		//Destination cell
		if(i==n-1 && j==n-1 ) {
		for(int r=0;r<n;r++) {
			for(int c=0;c<n;c++) {
				System.out.print(path[r][c]+" ");
			}
		      System.out.println();
		   }
		System.out.println();
		   path[i][j]=0;
			return ;
		}
		// include the cell in current path
		//top
		solveMaze1(i-1,j,arr,path) ;
		// right
		solveMaze1(i,j+1,arr,path);
		//Down
		solveMaze1(i+1,j,arr,path);
		//left
		solveMaze1(i,j-1,arr,path);
		path[i][j]=0;
	}

}
