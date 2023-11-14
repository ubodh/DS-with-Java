package fandamental;
import java.util.Scanner;
public class delta {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    	int i=1;
		int mid=(n/2)+1;
		int k=1;
		while(i<=mid) {
			int space =1;
			while(space<=n-i) {
				System.out.print('.');
				space++;
			}
			int star=1;
			while(star<=i+i-1)
			{
				System.out.print('*');
				star++;
			}
			System.out.println();
			i++;
		}
		int j=1;
		 int x=n;
		 int mm=n/2;
		 while(j<=mm) {
			 int space =x;
			 while(space<=n+mm) {
				 System.out.print('.');
			       space=space+1;
		 }
			 int star=j;
			 while(star<=2*mm-j) {
				 System.out.print('*');
				 star++;
			 }
			 System.out.println();
			 j++;
			 x--;

		} 	
	}
}
