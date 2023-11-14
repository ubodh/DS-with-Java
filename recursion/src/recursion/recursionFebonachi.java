package recursion;

public class recursionFebonachi {
public static int printt(int n) {
	if(n<=1) return  n;
	int f=printt(n-1);
	int l=printt(n-2);
	return f+l;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.print(printt(n));

	}

}
