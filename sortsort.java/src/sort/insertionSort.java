package sort;
public class insertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,6,8,4,5,2,3};
		
		for(int i=1;i<arr.length;i++) {
			int k=arr[i];//9
			int j=i-1;
			while(j>=0 && arr[j]>k) {
				      arr[j+1]=arr[j];
			    	  j--;
			    	  // 7 6 9 8 4 5 2 3
			      }
			      arr[j+1]=k;
			}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
        }
		}
}
