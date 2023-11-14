package sort;

import java.util.Scanner;

public class stringStorInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n= str.length();
		int[] freq = new int[n]; // Assumes ASCII character set
	    for (int i = 0; i <n; i++) {
	        freq[str.charAt(i)]++;
	    }
	    for(int i=0;i<freq.length;i++) {
	    	System.out.println(freq[i]);
	    }
	}

	}
