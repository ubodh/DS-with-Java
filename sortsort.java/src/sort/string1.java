package sort;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
		String s1="abcq";
		 //int at = indexOfDifference(s, s1);
		int s5=9;
		int s4=1;
				boolean  s3=stringCompaire(s,s1);
				System.out.print(s3);

	}

	private static boolean stringCompaire(String s, String s1) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s1.charAt(i))
				return false;
		}
		return true;
	}

}
