package recursion;

public class removex {
public static String printt(String s) {
	if(s.length()==1) return s;
	String ss=printt(s.substring(1));
	if(s.charAt(0) ==s.charAt(1)) {
		return ss;
	}else {
		//String sss=printt(s.substring(1),a,b);
		return s.charAt(0)+ss;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(printt("abxxavxb"));

	}

}
