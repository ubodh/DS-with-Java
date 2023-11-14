package StringFandamental;
public class split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="abc abs aba";
         String []arr=s.split("\\s");
         String s1="";
         for(String i:arr) {
        	 s1=i+s1;
         //System.out.println(i);
         }
         System.out.println(s1);
//         String ss="aba";
//         String sss="aba";
//         String ssss=new String(sss);
//         System.out.print(ss.equals(ssss));

	}

}
