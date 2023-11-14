package sort;

public class mergeSort {
	public static void merge(int arr[],int a[],int b[]) {
		int i=0;int j=0;int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				arr[k]=a[i];
				k++;i++;
			}else {
				arr[k]=b[j];
				k++;j++;
			}
		}
		while(i<a.length) {
			arr[k]=a[i];
			k++;i++;
		}
		while(j<a.length) {
			arr[k]=b[j];
			k++;j++;
		}
	}
	public static void mergeSort(int arr[]) {
		if(arr.length<=1) return ;
		int a[]=new int[arr.length/2];
		int b[]=new int[arr.length-a.length];
		for(int i=0;i<arr.length/2;i++) {
			a[i]=arr[i];
		}
		for(int j=arr.length/2;j<arr.length;j++) {
			b[j-arr.length/2]=arr[j];
		}
		mergeSort(a);
		mergeSort(b);
		merge(arr,a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,6,4,8,7,9};
		mergeSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");

	}

	}
}
