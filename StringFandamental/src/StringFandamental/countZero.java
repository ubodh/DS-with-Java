
package StringFandamental;

public class countZero {
public static void print(int x) {
	System.out.print(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method st
		//print(x);
	   String ss="123408";
	   double x=1;
	   for(int i=0;i<ss.length();i++) {
		   x= ss.charAt(i)-'0';
			   if(x==0)continue;

		   System.out.println(x+1);
		   //x=x*Math.pow(10,ss.length()-i)+0;
	   }
	
	  System.out.print(x);

	}

}
