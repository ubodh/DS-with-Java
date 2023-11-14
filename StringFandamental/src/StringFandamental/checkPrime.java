package StringFandamental;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print("it is not prime number");
				return ;
			}
		}
		if(i==n)
			System.out.print("it is prime number");
	}

}
