package permutation;


import java.util.ArrayList;
import java.util.Scanner;

public class kThPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String str=kPermution(n,k);
           System.out.println(str);
	}

	private static String kPermution(int n, int k) {
		// TODO Auto-generated method stub
		int fact=1;
		ArrayList<Integer>number=new ArrayList<>();
		for(int i=1;i<n;i++) {
			fact=fact*i;
			number.add(i);
		}
		number.add(n);
		k=k-1;
		String ans="";
		while(true) {
			ans=ans+number.get(k/fact);
			number.remove(k/fact);
			if(number.size()==0)
			{
				break;
			}
			k=k%fact;
		  fact=fact/number.size();
		}
		return ans;
	}

}
