package setAndSubset;

import java.util.ArrayList;

public class PowerSet {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        solve(arr);
    }

    private static void solve(int[] arr) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < (1 << arr.length); i++) {
            ArrayList<Integer> ans = new ArrayList();
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) != 0) {
                    ans.add(arr[j]);
                }
            }
            a.add(ans);
        }
        for (ArrayList<Integer> jj : a) {
            for (int j : jj) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
