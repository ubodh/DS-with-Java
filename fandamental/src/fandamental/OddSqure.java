package fandamental;
import java.util.Scanner;
public class OddSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int temp=1;
			int p=2*i-1;
			while(j<=n) {
				if(p>(2*n-1)) {
					System.out.print(2*temp-1);
					temp++;
				}
				else
				System.out.print(p);
				p=p+2;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
