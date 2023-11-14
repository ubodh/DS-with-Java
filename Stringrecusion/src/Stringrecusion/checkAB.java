package Stringrecusion;

public class checkAB {
	 public static boolean checkABString(String s) {
	        // Base case: If the string is empty, return true
	        if (s.length() == 0) {
	            return true;
	        }
	        
	        // If the first character is not 'a', return false
	        if (s.charAt(0) != 'a') {
	            return false;
	        }
	        
	        // If the second character is 'b', check for "bb" pattern
	        if (s.length() > 1 && s.charAt(1) == 'b') {
	            // If the substring starting from index 1 doesn't match "bb", return false
	            if (s.length() > 2 && !s.substring(1, 3).equals("bb")) {
	                return false;
	            }
	            // Recursively check the substring starting from index 3
	            return checkABString(s.substring(3));
	        } else {
	            // Recursively check the substring starting from index 1
	            return checkABString(s.substring(1));
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb";//bb
		System.out.print(checkABString(s));

	}

}
