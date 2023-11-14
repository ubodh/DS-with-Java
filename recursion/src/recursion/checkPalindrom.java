package recursion;

public class checkPalindrom {
	public static boolean printt(int arr[],int i,int n) {
		if(i>=n/2)
			return true;
		if(arr[i]!=arr[n-1-i])
			return false;
         return printt(arr,i+1,n);
	}
	public static void main(String args[]) {
		int arr[]= {2,2,3,2,1};
		System.out.print(printt(arr,0,arr.length));
	}

}
