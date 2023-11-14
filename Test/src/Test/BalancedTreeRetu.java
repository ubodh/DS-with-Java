package Test;

public class BalancedTreeRetu {

//	public class putZeroInRowAndColum {
//		public static void solve(int matrix[][],int n,int m) { 
//			for(int i=0;i<matrix.length;i++) {
//				for(int j=0;j<matrix[0].length;j++) {
//					if(i==n||j==m) {
//						matrix[i][j]=0;
//					}
//					
//				}
//			}
//		}
	 public static void setZeros(int matrix[][]) {
	        // Write your code here..
		 int rI=0;
		 int cI=0;
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[0].length;j++) {
				 if(matrix[i][j]==0) {
				     // solve(matrix,i,j);
					System.out.println(i+" "+j);
				 }
			 }
			 System.out.println();
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[][]= {{1, 2, 3},
			        {4 ,0 ,6},
			        {7 ,8 ,9}};
	 setZeros(arr);
	  for(int[] i:arr) {
		  for(int j:i) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	  System.out.print("hello");
		
	}

}
