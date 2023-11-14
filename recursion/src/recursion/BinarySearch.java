package recursion;

public class BinarySearch {
public static int BinarySearch(int arr[],int x,int s,int e) {
	if(s>e)return -1;
	int miadI=(s+e)/2;
	if(arr[miadI]==x)return miadI;
	else if(arr[miadI]<x) {
		return BinarySearch(arr,x,miadI+1,e);
	}else {
		return BinarySearch(arr,x,s,miadI-1);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int arr[]= {1,2,3,7,11};
               int x=7;
               System.out.print(BinarySearch(arr,x,0,arr.length-1));
	}

}
