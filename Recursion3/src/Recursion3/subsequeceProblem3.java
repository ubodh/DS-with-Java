package Recursion3;

public class subsequeceProblem3 {
	public static void generateSubsequences(String input, String output) {
	    if (input.length() == 0) {
	        System.out.println(output);
	        return;
	    }
	    
	    // Exclude the first character
	    generateSubsequences(input.substring(1), output);
	    
	    // Include the first character
	    generateSubsequences(input.substring(1), output + input.charAt(0));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example usage
		String input = "abc";
		String output = "";
		generateSubsequences(input, output);


	}

}
