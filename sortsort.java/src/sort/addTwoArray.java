package sort;

public class addTwoArray {
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		    int n = arr1.length;
	        int m = arr2.length;
	        int o = n+1;
	        int sum1 = 0, sum2 = 0, totalSum = 0;
	        
	        for(int i = 0; i<n; i++)
	        {
	            sum1+= arr1[i] * Math.pow(10,(n-1-i));
	            
	        }
	           
	        for(int i = 0; i<m; i++)
	        {
	            sum2+= arr2[i] * Math.pow(10,(m-1-i));
	            
	        }
	        totalSum = sum1+sum2;
	        for(int i=o-1; i>=0; i--)
	        {
	            output[i] = totalSum % 10;
	            totalSum = totalSum/10;
	        }
            }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {6 ,2 ,4};
		int arr2[]= {7 ,5 ,6};
		int arr3[]=new int[4];
          sumOfTwoArrays(arr1,arr2,arr3);
          for(int i=0;i<arr3.length;i++) {
        	  System.out.print(arr3[i]);
          }
          
	}

}
