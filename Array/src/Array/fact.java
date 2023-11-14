package Array;

public class fact {

	public static int fact(int n) {
		if(n==1) return 1;
		int sm=fact(n-1);
		int big=n*sm;
		return big;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fact(4));

	}

}
