package fandamental;
import java.util.Scanner;
public class paitern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int i=1;
		  while(i<=n){
			  int space=1;
			  int r=0;
			  while(space<=n-i){
				  System.out.print(' ');
				  r++;
				  space =space+1;
			  }
			  int p=1;
			  int k=i;
			  while(p<=i+1-1) {
			  System.out.print(k);
			  	k++;
			  	p++;
			  }
			  int tt=k-1;
			  int temp=1;
			  while(temp<i) {
				  tt--;
				  System.out.print(tt);
				  temp++;
			  }
			  System.out.println();
			  i=i+1;
		  }
	

	}
}



