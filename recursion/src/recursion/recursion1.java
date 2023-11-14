package recursion;

public class recursion1 {

//@akhileshsaga217
//7 months ago
//Question 5 - Java Code :
//    static void reverse(int i,int N){
//        if(i>N){
//            return ;
//        }
//        reverse(i+1,N);
//        System.out.println(i);
//    }
//	public static int  solve(int arr[],int i) {
//		if(arr.length-1==i)
//			return arr[i];
//		 int p=10;
//		 p=p*10;
//		return arr[i]*p+solve(arr,i+1);
//	}
//	public static void printt(int arr[]) {
//		System.out.print( solve(arr,0));
//	}
    public static void main(String args[]){
        int N=10;
       // reverse(1,N);
        int arr[]= {1,2,3,4};
        int arr1[]= {2,3,4};
        //printt(arr);
       // printt(arr1);
        solve(arr);
    }

	private static void solve(int[] arr) {
		// TODO Auto-generated method stub
		 solve1(arr,0,arr.length);
		 for(int i :arr) {
			 System.out.print(i);
		 }
		
	}

	private static void solve1(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		if(i<length)
			return;
		  int temp=arr[i];
		  arr[i]=arr[length];
		  arr[length]=temp;
			 solve1(arr,i+1,length-1);
			
		
	}
}

