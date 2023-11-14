package sort;

public class quickSort {
	public static void leaders(int[] input) {
        int n =input.length;
        int maxRight =input[n - 1];
        String leaders = maxRight+" ";
        for (int i = n - 2; i >= 0; i--) {
            if (input[i] > maxRight) {
                maxRight =input[i];
                leaders+=maxRight+" ";
            }
        }
        System.out.print(leaders);
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {3,12,34,2,0,-1};
		  leaders(arr);
	}

	

}
