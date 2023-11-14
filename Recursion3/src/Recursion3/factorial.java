package Recursion3;
public class factorial {
//	public static void factorial(int n) {
//		if(n==0) {
//			return 1;
//		}
//		return (n*factorial(n-1));
//		
//	}

	public static void factorial1(int n,int ans) {
		if(n==0) {
			System.out.print(ans);
			return ;
		}
		ans=ans*n;
		factorial1(n-1,ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		factorial1(n,1);

	}

}
