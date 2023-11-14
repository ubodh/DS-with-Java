package subodhkumar;

import java.util.Scanner;

public class demo1 {
	public static int array11(int[] nums, int index) {
	    if(index >= nums.length)
	        return 0;
	          
	    if(nums[index] == 11)
	        return 1 + array11(nums, index + 1);
	                    
	    return array11(nums, index + 1);
	}
	public static void main(String []args) {

		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
	   System.out.print(array11(a,0));

	}

}
