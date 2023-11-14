package permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		List<List<Integer>>ans=permutation(arr);
		for(List<Integer>i:ans) {
			for(int j:i) {
				System.out.print(j+" ");
			}System.out.println();
		}

	}

	private static List<List<Integer>> permutation(int[] arr) {
		// TODO Auto-generated method stub
		List<List<Integer>>ans=new ArrayList<>();
		List<Integer>ds=new ArrayList<>();
		boolean bool[]=new boolean[arr.length];
		helper(arr,ans,ds,bool);
		
		return ans;
	}

	private static void helper(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] bool) {
		// TODO Auto-generated method stub
		if(ds.size()==arr.length) {
			ans.add(new ArrayList<>(ds));
			return ;
		}
		for(int i=0;i<arr.length;i++) {
			if(!bool[i])
			{
				bool[i]=true;
				ds.add(arr[i]);
				helper(arr, ans, ds, bool);
				ds.remove(ds.size()-1);
				bool[i]=false;
			}
		}
		
	}

}
