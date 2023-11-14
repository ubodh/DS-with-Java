package recursion;

public class ArraysRevers {
	public static void printt(int arr[],int i) {
		if(i==arr.length)
			return ;
		printt(arr,i+1);
		System.out.print(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		printt(arr,0);

	}

}
