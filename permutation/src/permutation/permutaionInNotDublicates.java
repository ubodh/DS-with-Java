package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutaionInNotDublicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,3};
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
		helper(arr,ans,0);
		return ans;
	}

	private static void helper(int[] arr, List<List<Integer>> ans, int ind) {
		// TODO Auto-generated method stub
		if(ind==arr.length) {
			List<Integer>new_L=new ArrayList<>();
			for(int i:arr) {
				new_L.add(i);
			}
			ans.add(new_L);
		}
		for(int i=ind;i<arr.length;i++) {
			if(i!=ind && arr[i]==arr[ind]) {
				continue;
		}else {
			swap(i,ind,arr);
			helper(arr, ans, ind+1);
			swap(i, ind, arr);
		}
		}
		
		
	}

	private static void swap(int i, int ind, int[] arr) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[ind];
		arr[ind]=temp;
		
	}

}
