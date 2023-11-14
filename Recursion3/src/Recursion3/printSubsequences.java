package Recursion3;
public class printSubsequences {
	public static void printSubsequences1(String str) {
	    printSubsequencesHelper(str, "", 0);
	}

	private static void printSubsequencesHelper(String str, String output, int index) {
	    if (index == str.length()) {
	        System.out.println(output);
	        return;
	    }

	    // Include the character at current index
	    printSubsequencesHelper(str, output + str.charAt(index), index + 1);

	    // Exclude the character at current index
	    printSubsequencesHelper(str, output, index + 1);
	}
	public static void main(String args[]) {
	String str="abc";
	printSubsequences1(str);
	}
}
