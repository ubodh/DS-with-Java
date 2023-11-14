package fandamental;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String str=s.nextLine();
			System.out.println(str);
			for(int i=0;i<str.length();i++) {
				System.out.println(str.charAt(i));
			}
		}
		

	}

}
