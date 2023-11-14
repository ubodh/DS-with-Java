//package setAndSubset;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class subsetNotDublicates {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int arr[] = {1,2,2,3,3,4};
//		List<List<Integer>>ans=solve(arr);
//		for(List<Integer>i:ans) {
//			for(int j:i) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}
//	}
//
//	private static List<List<Integer>> solve(int[] arr) {
//		// TODO Auto-generated method stub
//		Arrays.sort(arr);
//		List<List<Integer>>ans=new List<List<Integer>>();
//		help(arr,arr.length,0,new List<>(),ans)
//		
//		
//		return ans;
//	}
//
//	private static void help(int[] arr, int length, int i, List<Integer>list, List<List<Integer>> ans) {
//		// TODO Auto-generated method stub
//		
//		ans.add(list);
//		for(int j=i;j<arr.length;j++) {
//			if(i==j && arr[i]==arr[j]) continue;
//			list.add(arr[j]);
//			help(arr, length, i+1, list, ans);
//			list.remove(arr.length-1);
//		}
//		
//		
//	}
//
//}
package setAndSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetNotDublicates {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        List<List<Integer>> ans = solve(arr);
        for(List<Integer> i : ans) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> solve(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        help(arr, arr.length, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void help(int[] arr, int length, int i, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        for(int j = i; j < length; j++) {
            if(j != i && arr[j] == arr[j-1]) continue;
            list.add(arr[j]);
            help(arr, length, j + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}

