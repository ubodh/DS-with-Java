package setAndSubset;
import java.util.ArrayList;

public class subSetAll {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        solve(arr);
    }

    private static void solve(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr, 0, arr.length, ans);
    }

    private static void helper(int[] arr, int i, int length, ArrayList<Integer> ans) {
        System.out.println("helper called with i = " + i + ", ans = " + ans);
        if (i == length) {
            for (int ii : ans) {
                System.out.print(ii + " ");
            }
            System.out.println();
            return;
        }
        ans.add(arr[i]);
        // take element
        helper(arr, i+1, length, ans);
        ans.remove(ans.size() - 1);
        // do not take element
        helper(arr, i+1, length, ans);
        System.out.println("helper returns with i = " + i + ", ans = " + ans);
    }
}
