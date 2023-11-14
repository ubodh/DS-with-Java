package fandamental;

import java.util.Scanner;

public class oprator {
	public static boolean checkMember(int n){
//		if(n==0|| n==1||n==2)
//		return true;
	      int a = -1, b = 1;
		
		int i = 1;
		while (i <= 100009) {
			int c = a + b;
		    if(c!=n)
			return true;
			a = b;
			b = c;
			i=i+c;
		}
		return false;
	}
	public static void main(String args[]) {
		  
	   // System.out.print(checkMember(1));
		int i = 0; 
	    for (System.out.print("Hi"); i < 1; i++) 
	        System.out.print("Ninjas"); 
	    }
}


