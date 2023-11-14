package setAndSubset;

public class isSquareUsingBitManipulation {
	public static boolean isPerfectSquare(int n) {
	    int i = 1;
	    while (n > 0) {
	        n -= i;
	        i += 2;
	    }
	    return n == 0;
	}

	public static boolean isSquareUsingBitManipulation1(int n) {
	    // Check if n is negative
	    if (n < 0) {
	        return false;
	    }
	    
	    // Check if n is 0 or 1
	    if (n == 0 || n == 1) {
	        return true;
	    }
	    
	    // Use bit manipulation to check if n is a perfect square
	    int x = n >> 1;
	    if (n % 2 != 0) {
	        x++;
	    }
	    return isPerfectSquare(x);
	}

	public static boolean isPerfectSquare(int num) {
	    int root = (int) Math.sqrt(num); // get integer square root
	    return root * root == num; // check if square of root equals num
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    if(isSquareUsingBitManipulation1(8))
                    	System.out.println(true);
                    else
                    	System.out.println(false);
                    
	}

}
