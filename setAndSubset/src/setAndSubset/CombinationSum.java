package setAndSubset;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,2,3,3,4};
		int sum = 2;
       List<List<Integer>>ans = CombinationSum1(arr, sum);
       for(List<Integer>i:ans) {
    	   for(int j:i) {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

	private static List<List<Integer>> CombinationSum1(int[] arr, int sum) {
		// TODO Auto-generated method stub
		  List<List<Integer>>ans=new ArrayList<>();
		  solve(arr,sum,0,ans,new ArrayList<>());
		return ans;
	}

	private static void solve(int[] arr, int sum, int i, List<List<Integer>> ans, List<Integer>ds){
		if(i==arr.length) {
			if(sum==0) {
				ans.add(new ArrayList<>(ds));
				
			}
			return ;
		}
		if(arr[i]<=sum) {
			ds.add(arr[i]);
			solve(arr, sum-arr[i], i, ans, ds);
		     ds.remove(ds.size()-1);
		}
		     solve(arr, sum, i+1, ans, ds);
		// TODO Auto-generated method stub
	}

}
