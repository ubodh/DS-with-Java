package fandamental;

import java.util.Scanner;

public class HalfDimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)System.out.println('*');
		else {
		System.out.println('*');
		System.out.println("*1*");
		int i=2;
		while(i<=n) {
			int j1=1;
			while(j1<=1) {
				System.out.print('*');
				int j2=1;
				while(j2<=i) {
					System.out.print(j2);
					j2++;
			           }
				j2=j2-2;
				while(j2>0) {
					System.out.print(j2);
					j2--;
				}
				j1++;
			}
			System.out.print('*');
			System.out.println();
			i++;
	}
//		//case-2
		/* int p=1;
		int n1=1;
		System.out.print('*');
			int j=1;
			while(j<=n) {
				System.out.print(j);
				j++;
		           }
			j=j-2;
			while(j>0) {
				System.out.print(j);
				j--;
			}	
		System.out.print('*');
		//case -3
		System.out.println();
		*/
		int tt=1;
		while(tt<=n-1) {
			int j11=1;
			while(j11<=1) {
				System.out.print('*');
				int j2=1;
				while(j2<=n-tt) {
					System.out.print(j2);
					j2++;
			           }
				j2=j2-2;
				while(j2>0) {
					System.out.print(j2);
					j2--;
				}
				j11++;
			}
			System.out.print('*');
			System.out.println();
			tt++;
		}
		System.out.print('*');
		}
	}
}

