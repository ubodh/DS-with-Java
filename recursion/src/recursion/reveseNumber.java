package recursion;

public class reveseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		System.out.print(printt(n));

	}

	private static int  printt(int n) {
		// TODO Auto-generated method stub
		if(n==0) return 0;
		  int sum=n%10;
		int x=printt(n/10);
		return sum*10+x;
		
		
	}

}
