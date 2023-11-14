package swapTwoNumber;

class Pair{
	int a,b;
	Pair(int a,int b){
		this.a=a;
		this.b=b;
	}
}

public class swapTwo_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=11;
		Pair pair=new Pair(a,b);
		solve(pair);
		System.out.println("a="+pair.a+" "+"b="+pair.b);

	}

	private static void solve(Pair pair) {
		// TODO Auto-generated method stub
		int temp=pair.a;
		pair.a=pair.b;
		pair.b=temp;
		
	}

}
