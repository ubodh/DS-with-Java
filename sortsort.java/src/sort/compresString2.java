package sort;

public class compresString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbaccc";
		String s1=s.charAt(0)+"";
		int ct=1;
		for(int i=1;i<s.length();i++) {
			char cur=s.charAt(i);
			char prev=s.charAt(i-1);
			if(cur==prev) { 
				ct++;
			}else {
				 if(ct>1) {
					 s1+=ct;
					 ct=1;
				 }
				 s+=cur;
			}	 
			
		
		}
		if(ct>1) {
			s1+=ct;
			ct=1;
		}
		System.out.print(s1);

	}

}
