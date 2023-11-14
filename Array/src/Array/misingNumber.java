package Array;

public class misingNumber {
	public static int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        for(int i=0;i<n-1;i++){
        sum+=array[i];
        }
        int sum1=(n*(n+1))/2;
        return sum1-sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5};
		int s=0;
		for(int i:arr) {
			s+=i;
		}
		//System.out.print(MissingNumber(arr,arr.length));
		int n=arr.length;
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		System.out.println(s);

	}

}
