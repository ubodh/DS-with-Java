package setAndSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printAllSumOFPermutation {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4};
		int sum = 2;
        List<Integer> ans = new ArrayList<>(); 
        solve(arr, 0, sum, ans, 0);       
	}

	private static void solve(int[] arr, int i, int sum, List<Integer> dp, int s) {
		if (i == arr.length) {
			if (s == sum) {
				for (int j : dp) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			return;
		}
		dp.add(arr[i]);
		s += arr[i];
		solve(arr, i + 1, sum, dp, s);
		s -= arr[i];
		dp.remove(dp.size() - 1);
		solve(arr, i + 1, sum, dp, s);
	}
}
