package subodhkumar;

import java.util.Scanner;

public class demo {
    
	public static void main(String[] args) {
		int OccurencrOf11(int a,int n,int i) {
	    	int ct=0;
	    	if(i==n) return ct;
	    	if(11==a[i])
	    		ct++;
	    	OccurencrOf11(a,n,i++);
	    }
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		System.out.print(OccurencrOf11(a,n,0));

	}

}
