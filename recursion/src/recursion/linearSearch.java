package recursion;

public class linearSearch {
	public static int solve(int arr[],int i,int x){
		if(i<0)
		 return -1;
		 if(arr[i]==x)
		 return i+1;
	 return solve(arr,i-1,x);
	}
		public static int firstIndex(int input[], int x) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
			return solve(input,input.length-1,x);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,8};
		int x=9;
		System.out.print(firstIndex(arr,x));

	}

}
