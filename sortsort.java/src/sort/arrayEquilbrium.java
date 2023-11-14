package sort;

public class arrayEquilbrium {
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int temp = arr[0];
		int k=0;
		for (int i = 1; i < arr.length; i++) {
			int sumOfrest = sum - arr[i] - temp;
			if (sumOfrest == temp) {

                         k=i;
			}
			else
				temp += arr[i];

		}
		if(k==0) return -1;
		 return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 10, -10, 4, 2, 9};
		int x=arrayEquilibriumIndex(arr);
		System.out.print(x);

	}

}
