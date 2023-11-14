package recursion;

public class findTheNumberInArray {

    public static boolean solve(int arr[],int n,int x){
		 if(n==0) 
		 return true;
		 solve(arr,n-1,x);
		   return arr[n-1]==x?false:true;
	 }
public static boolean checkNumber(int input[], int x) {
/* Your class should be named Solution
* Don't write main().
* Don't read input, it is passed as function argument.
* Return output and don't print it.
* Taking input and printing output is handled automatically.
*/
return solve(input,input.length,x);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {9,8,10};
		  System.out.print(checkNumber(arr,8));
		  

	}

}
