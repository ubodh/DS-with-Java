package fandamental;

public class p {
	 public static void main(String[] args) {
	        int n = 5;  // Number of rows in the pattern

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i+1; j++) {
	                System.out.print(j);
	            }
	            for (int j = 1; j <= 2 * i - 2; j++) {
	                System.out.print("*");
	            }
	            for (int j = n - i + 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
}
