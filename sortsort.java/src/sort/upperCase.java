package sort;

import java.util.Scanner;

public class upperCase {
          public static char isUpper(char ch) {
        	  return  (char) ('A'+(ch-'a'));
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 for(int i=0;i<s.length();i++) {
			 System.out.print(isUpper(s.charAt(i)));
		 }

	}
		
	}
