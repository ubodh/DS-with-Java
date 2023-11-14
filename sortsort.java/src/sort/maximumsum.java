import java.util.*;
import java.util.Scanner;
package sort;

public class maximumsum {

	   static long findMaximumSubarraySum(int Arr[],int K,int N){

	        long sum=0;

	      

	        for(int i=0;i<K;i++){

	            sum+=Arr[i];
	        }

	        long max=sum;

	        for(int i=K;i<N;i++){

	            sum+=Arr[i]-Arr[i-k];

	            max=Math.max(max,sum);

	        }

	        return max;
	    }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // input the array
	    int n = sc.nextInt();
	    int k=sc.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	    }
	      
	    // find the maximum subarray sum and print it
	    lo maxSubarraySum = findMaximumSubarraySum(arr,k,n);
	    System.out.println(maxSubarraySum);
	  }

}
