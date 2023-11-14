package sort;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {1,2,3,4,5};
		  int d=2;
		     //rotateArray(arr,d);
		  ArrayRotate(arr,d);
		     for(int i:arr) {
		    	 System.out.print(i);
		     }

	}

	private static void ArrayRotate(int[] arr, int d) {
		// TODO Auto-generated method stub
		int arr1[]=new int[d];
		for(int i=0;i<d;i++) {
			arr1[i]=arr[i];
		}
		int k=0;
		for(int j=d;j<arr.length;j++) {
			arr[k++]=arr[j];
		}
		
		for(int i=0;i<d;i++) {
			arr[k++]=arr1[i];
		}
		
	}

	private static  void rotateArray(int[] arr, int d) {
		// TODO Auto-generated method stub
		for(int i=0;i<d;i++) {
			int temp=arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
		      
	}

}
