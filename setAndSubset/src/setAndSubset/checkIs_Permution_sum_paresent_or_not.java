package setAndSubset;

import java.util.ArrayList;
import java.util.List;

public class checkIs_Permution_sum_paresent_or_not {

	public static void main1(String[] args) {
		
			int arr[] = {1,2,2,3,3,4};
			int sum = 2;
	        List<Integer> ans = new ArrayList<>(); 
	         boolean boo=solve(arr, 0, sum, ans, 0)==true?true:false;
	         System.out.println(boo);
		}

		private static boolean solve(int[] arr, int i, int sum, List<Integer> dp, int s) {
			if (i == arr.length) {
				if (s == sum) {
					return true;
				}else return false;
			}
			dp.add(arr[i]);
			s += arr[i];
			if(solve(arr, i + 1, sum, dp, s)==true) return true;
			s -= arr[i];
			dp.remove(dp.size() - 1);
			if(solve(arr, i + 1, sum, dp, s)==true)return true;
			return false;
		}
	}
