package sort;

public class compresString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbccca";
		String s1=s.charAt(0)+"";
		for(int i=1;i<s.length();i++) {
			char ch=s.charAt(i);
			char ch1=s.charAt(i-1);
			if(ch!=ch1)
				s1+=ch;
		}
		System.out.print(s1);
		

	}

}
