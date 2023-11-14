package Stringrecusion;

public class removeDublicate {
public static String ReplacDu(String s) {
	if(s.length()==1) return s;
	if(s.charAt(0)==s.charAt(1))
	{
          String s1=ReplacDu(s.substring(1));
          return ""+s1;
		//continue;
	}else {
		String s2=ReplacDu(s.substring(1));
		      return  s.charAt(0)+s2;
	   }
	//return s;
	//return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(ReplacDu("aaabbbbaccddd"));

	}

}
