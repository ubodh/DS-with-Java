package  Array;

import java.util.Arrays;

public class tripletCountt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5};
		Arrays.sort(arr);
		int arr1[]=new int[10001];
		int k=0;
		int ct=0;
		for(int i=0;i<arr.length;i++) {
			int t=0;
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i]+arr[j];
				if(temp==arr[t])
				ct++;
				t++;
			}
		}
		System.out.print(ct);
		 
	}
}
