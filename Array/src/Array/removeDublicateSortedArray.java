package Array;

public class removeDublicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,2,2};
		for(int i=arr.length;i>=1;i--) {
			int j=i-1;
			if(arr[i]==arr[j])
				continue;
			System.out.print(arr[i]);
		}
		

	}

}
