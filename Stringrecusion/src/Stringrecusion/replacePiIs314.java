package Stringrecusion;
public class replacePiIs314 {
	
 public static String Rep31(String s) {
	 
	 if(s.length()==1) return s;
	 if(s.charAt(0)=='p'&& s.charAt(1)=='i') {
		 String s1=Rep31(s.substring(2));
		  return 3.14+s1;
	 }
		  else
		  {
			  String s2=Rep31(s.substring(1));
			  return s.charAt(0)+s2;
		  }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Rep31("apipiapip"));

	}

}
