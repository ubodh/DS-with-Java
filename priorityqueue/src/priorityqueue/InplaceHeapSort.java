package priorityqueue;



public class InplaceHeapSort {

	public static void heapSort(int arr[]) {
		int n=arr.length;
		// Build the Heap
		for(int i=n/2-1;i>=0;i--) {
			downHeapify(arr,i,n);
		}
		// Remove element from starting one by one ,and put them at respectly last position
		for(int i=n-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			downHeapify(arr,0,i);
		}
	}
	private static void downHeapify(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		int parentIndex=i;
		int leftChildIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		while(leftChildIndex<n) {
			
			int minChildIndex=parentIndex;
			if(arr[leftChildIndex]<arr[minChildIndex]) {
				minChildIndex=leftChildIndex;
			}
			if(rightChildIndex<n && arr[rightChildIndex]< arr[minChildIndex]) {
				minChildIndex=rightChildIndex;
			}
			if(minChildIndex==parentIndex) {
				return ;
			}
			int temp=arr[parentIndex];
			arr[parentIndex]=arr[minChildIndex];
			arr[minChildIndex]=temp;
			parentIndex=minChildIndex;
			leftChildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {4,7,3,2,8,9,6,1};
      heapSort(arr);
      for(int i:arr) {
    	  System.out.println(i);
      }
	}

}
