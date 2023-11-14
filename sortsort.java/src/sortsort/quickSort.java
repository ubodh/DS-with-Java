package sortsort;
public class quickSort {
	public static int partition(int arr[],int si,int ei) {
		int countBelowElementPiviot=0;
		int piviot=arr[si];
		for(int j=si+1;j<=ei;j++) {
			if(piviot>arr[j]) {
				countBelowElementPiviot++;
			}
		}
		int store=arr[si+countBelowElementPiviot];
		arr[si+countBelowElementPiviot]=piviot;
		arr[si]=store;
//		while(si<(countBelowElementPiviot)) {
//			if(arr[countBelowElementPiviot]<arr[si] && arr[countBelowElementPiviot]>arr[ei]) {
//				int temp=arr[si];
//				arr[si]=arr[ei];
//				arr[ei]=temp;
//			}else if(arr[countBelowElementPiviot]>arr[si]) {
//				si++;
//			}else {
//				ei--;
//			}	
		int i1=si;
		int j1=ei;
		while(i1<j1) {
			if(piviot>arr[i1])
				i1++;
			else if(piviot=<arr[j1]) {
				j1--;
			}else {
				int temp=arr[i1];
				arr[i1]=arr[j1];
				arr[j1]=temp;
				i1++;
				j1--;
			}
		}
		return si+countBelowElementPiviot;
	}
	public static void solve(int arr[],int si,int ei) {
		if(si>=ei)
			return ;
		int partitionIndex=partition(arr,si,ei);
		solve(arr,si,partitionIndex-1);
		solve(arr,partitionIndex+1,ei);
	}
	public static void QuickSort(int arr[]) {
		solve(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,22,9,19,1,5,34,2};
		QuickSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
