package StringFandamental;

import java.util.Scanner;
public class isPalindrom{
public static boolean solve(String s,int si,int ei){
	if(si>=ei) return true;
	if(s.charAt(si)!=s.charAt(ei))
	return false;
	return solve(s, si+1, ei-1);
}
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		return solve(input,0,input.length()-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(isStringPalindrome(s))
			System.out.print(" it is a palindrom");
		else
			System.out.print("it is not palindrom");
		
		

	}

}
