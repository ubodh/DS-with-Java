package setAndSubset;

import java.util.ArrayList;
import java.util.Collections;

public class subSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		ArrayList<Integer>ans=solve(arr);
		for(int i:ans) {
			System.out.print(i+" ");
		}

	}

	private static ArrayList<Integer> solve(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans=new ArrayList<>();
		helper(arr,0,0,ans,arr.length);
		Collections.sort(ans);
		return ans;
	}

	private static void helper(int[] arr, int i, int sum, ArrayList<Integer> ans,int n) {
		// TODO Auto-generated method stub
		if(i>=n)
		{
			ans.add(sum);
			return ;
		}
		//taken
		helper(arr, i+1, sum+arr[i], ans, n);
		//not taken
		helper(arr, i+1, sum, ans, n);
		
	}

}
