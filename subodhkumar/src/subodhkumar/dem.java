package subodhkumar;

/*package subodhkumar;
import 
*/
import java.util.Scanner;
class Solution{
	static public int SumOfArray(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		return  sum;
	}
}

public class dem {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub
		  
		 Scanner kb=new Scanner(System.in); int n=kb.nextInt(); int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  a[i]=kb.nextInt();
			  } 
		  Solution ob=new Solution();
		 System.out.print(ob.SumOfArray(a,n));


	}
}
