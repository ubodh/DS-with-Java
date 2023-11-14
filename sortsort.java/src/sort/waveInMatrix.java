package sort;

public class waveInMatrix {
	public static void printWave(int[][]mat) {
		int r=mat.length;//1 5 9 10 6 2 3 7 11 12 8 4
		for(int i=0;i<mat[0].length;i++){
				if(i%2==0) {
					for(int j=0;j<mat.length;j++)
				     System.out.print(mat[j][i]+" ");
				}
				else{
					int p=i;
					for(int k=r-1;k>=0;k--)
					System.out.print(mat[k][p] + " ");
					
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4}, 
				{5,6,7,8}, 
				{9,10,11,12}};
	printWave(arr);

	}

}
