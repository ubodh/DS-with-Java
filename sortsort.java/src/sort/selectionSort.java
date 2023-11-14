package sort;
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,0,4,2,7,6};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int k=i;
			int p=i;
			int min=arr[i];//3
			for(int j=i+1;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					p=j;
				}
			}
			int temp=min;
			arr[p]=arr[k];
			arr[k]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

	}

}
