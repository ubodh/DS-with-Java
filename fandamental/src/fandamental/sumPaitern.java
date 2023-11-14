package fandamental;
import java.util.Scanner;
public class sumPaitern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int p;
		while(i<=n){
			int j=1;
			int sum=0;
			p=i;
			while(j<=i){
				if(p==i)
				System.out.print(j);
				else {
				System.out.print('+');
				System.out.print(j);
				}
				sum=sum+j;
				j++;
				p++;
			}
			System.out.print('=');
			System.out.print(sum);
			System.out.println();
			i++;
		}	

	}

}
