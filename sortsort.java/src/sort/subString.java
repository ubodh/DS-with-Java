package sort;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		subString1(str);
	}
//	}a 
//	ab 
//	abc 
//	b 
//	bc 
//	c 

	private static void subString1(String str) {
		// TODO Auto-generated method stub
		int n=str.length();
		//String s="";
//		for(int j=0;j<n;j++) {
//			String s="";
//		for(int i=j;i<n;i++) {
//			s+=str.charAt(i);
//			System.out.println(s);
//		}
//		}
//		//System.out.print(s);
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++){
				int end=j+i-1;
				System.out.println(str.substring(j,end+1));
			}
		}
		
	}

}
