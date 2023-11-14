package ExamPractic;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		ArrayList<Integer>ans=new ArrayList<>();
		
		int n=permutation.size();
		
		if(n==1){
			ans.add(permutation.get(n-1));
			return ans;
		   }

		if(n==2){
			ans.add(permutation.get(n-1));
			ans.add(permutation.get(n-2));
			return ans;
		    }

		for(int i=0;i<n-2;i++){
			ans.add(permutation.get(i));

		}
		ans.add(permutation.get(n-1));
		ans.add(permutation.get(n-2));
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		ArrayList<Integer>ans=nextPermutation(arr);
		for(int i:ans) {
			System.out.print(i+" ");
		}

	}

}
