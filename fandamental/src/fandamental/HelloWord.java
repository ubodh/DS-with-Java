package fandamental;

import java.util.Scanner;

public class HelloWord {

	
		public static void main(String[] args) {
			//Your code goes here
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=1;
			int x=n;
			while(i<=n){
			    int j=1;
				int p=1;
				while(j<=n-i){
					System.out.print(" ");
					j=j+1;
				}
				
				System.out.println();
				i=i+1;
			}
			}
		}

	}

}
