package fandamental;

import java.util.Scanner;

public class cone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*****
//		 ***
//		  *
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();//3
		 int i=1;
		 int x=n;
		 int mm=n/2;
		 while(i<=mm) {
			 int space =x;
			 while(space<n) {
				 System.out.print(' ');
			       space=space+1;
		 }
			 int star=i;
			 while(star<=2*mm-i) {
				 System.out.print('*');
				 star++;
			 }
			 System.out.println();
			 i++;
			 x--;
			 
		 }
	}

}
