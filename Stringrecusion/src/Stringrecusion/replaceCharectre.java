package Stringrecusion;
public class replaceCharectre {//"abcxvxccxy"    'x'   'y'
 public static String replaceChar(String s,char a,char b) {
	 if(s.length()==0) return s;
	 String small=replaceChar(s.substring(1),a,b);
	 if(s.charAt(0)==a)
		return  b+small;
	 else
		 return s.charAt(0)+small;
		 
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcxvxccxy";
		//System.out.print(replaceChar(s,'x','y'));
		System.out.print(s.substring(1));

	}

}
