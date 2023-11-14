package setAndSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,1,2,7,6,1,5};
		int sum = 8;
       List<List<Integer>>ans = CombinationSum22(arr, sum);
       for(List<Integer>i:ans) {
    	   for(int j:i) {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

	private static List<List<Integer>> CombinationSum22(int[] arr, int sum) {
		// TODO Auto-generated method stub
		 List<List<Integer>>ans=new ArrayList<>();
		 Arrays.sort(arr);
		  solve(arr,sum,0,ans,new ArrayList<>());
		return ans;
		
	}

	private static void solve(int[] arr, int sum, int i, List<List<Integer>> ans, ArrayList<Integer>ds) {
		// TODO Auto-generated method stub
		
		if(sum==0) {
			ans.add(new ArrayList<Integer>(ds));
			return;
		}
		for(int j=i;j<arr.length;j++) {
			if(j>i && arr[j]==arr[j-1])continue;
			if(arr[j]>sum) break;
			ds.add(arr[j]);
			solve(arr, sum-arr[j], j+1, ans,ds);
			ds.remove(ds.size()-1);
			
		}
		
	}
	
	}


