package sort;

public class checkSorted {
 public static boolean checkSorted(int arr[],int n) {
	 if(n==0) return true;
	 if(arr[0]>arr[1]) return false;
	 int a[]=new int [n];
	 for(int i=1;i<=n;i++) {
		 a[i-1]=arr[i];
	 }
	 return checkSorted(arr,n-1);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,2,3,4};
		System.out.print(checkSorted(arr,arr.length-1));

	}

}
