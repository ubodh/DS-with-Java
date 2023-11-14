package StringFandamental;
import java.util.Scanner;
 class Solution {
	 public static void printttt(int n) {
	
/*
1234554321
1234**4321
123****321
12******21
1********1
*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i+1; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= 2 * i - 2; j++) {
				System.out.print("*");
			}
			for (int j = n - i + 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
 }

public class paitern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt(); 
		Solution ob=new Solution();
		ob.printttt(n);
	}
}
