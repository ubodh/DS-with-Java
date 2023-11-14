package sort;

import java.util.Scanner;

public class reverseEachWord {


	public static String reverseEachWord(String str) {
		//Your code goes here

		if (str == null || str.isEmpty()) {
        return str;
    }

        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\s+");
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    
	}
	
	public static void main(String args[]) {
	                Scanner sc=new Scanner(System.in);
	                 String s=sc.nextLine();
	                 System.out.print(reverseEachWord(s));
	                 
	}

}
