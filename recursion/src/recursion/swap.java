package recursion;

public class swap {
	public static void swap(int s,int e) {
		int temp=s;
		s=e;
		e=temp;
	}
	public static void solve(int arr[],int start,int end) {
		if(start>=end)
			return ;
		int temp=arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
			//swap(arr[start],arr[end]);
		 solve(arr,start+1,end-1);
	}
            public static void printt(int[] arr) {
            	solve(arr,0,(arr.length-1));
            	for(int i:arr) {
            		System.out.print(i);
            	}
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,3,4};
		printt(arr);

	}

}
