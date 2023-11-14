package fandamental;

public class binarySearch {
	public static int Binarysearch(int arr[],int x) {
		int s=0;
		int e=arr.length-1;
		int mid;
		while(s<e) {
			mid=(s+e)/2;
			if(x==arr[mid])
				return mid;
			else if(arr[mid]>x) {
				e=mid+1;
			}else {
				s=mid-1;
			}
			s++;
			e--;
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,20,25,29};
		int x=20;
		int x1=Binarysearch(arr,x);
		System.out.print(x1);
	}

}
