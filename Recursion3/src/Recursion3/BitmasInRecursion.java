package Recursion3;
import java.util.ArrayList;
import java.util.List;

public class BitmasInRecursion {
	

	
	    public static List<String> getSubsequences(String str) {
	        List<String> result = new ArrayList<>();
	        int n = str.length();

	        // Run a loop for all possible combinations of characters
	        for (int i = 0; i < (1<<n); i++) {
	            StringBuilder sb = new StringBuilder();
	            // Run a loop for each character
	            for (int j = 0; j < n; j++) {
	                // Check if jth bit is set in i, if yes then add jth character to the current subsequence
	                if ((i & (1<<j)) != 0) {
	                    sb.append(str.charAt(j));
	                }
	            }
	            // Add the current subsequence to the result list
	            result.add(sb.toString());
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        String str = "abc";
	        List<String> result = getSubsequences(str);
	        System.out.println(result);
	    }
	}

