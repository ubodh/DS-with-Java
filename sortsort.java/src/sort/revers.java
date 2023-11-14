package sort;

import java.util.Scanner;

public class revers {

	 public static String reverse(String w) {
		 String s="";
		 for(int i=0;i<w.length();i++) {
			 s=w.charAt(i)+s;
		 }
		 //System.out.print(s);
		 return s;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		//String s2=reverse(s1);
//		for(int i=0;i<s2.length();i++) {
//			System.out.print(s2.charAt(i));
//		}
//		if(s1==s2)
//			System.out.println("true");
//		else
//			System.out.println("false");
		String str1="abc";
		String str2="";
		System.out.println(str1.contains(str2));
		System.out.println(s1==s2);
		System.out.println(s2);
		System.out.println(s1);
	}
}