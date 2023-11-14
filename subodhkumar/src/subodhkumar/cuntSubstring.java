package subodhkumar;

import java.util.Scanner;
/*countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2*/

public class cuntSubstring {
	public static int countAbc(String str) {
		   if(str.length()>2){
		      if(str.substring(str.length()-3,str.length()).contains("abc")||str.substring(str.length()-3,str.length()).contains("aba")){
		      return countAbc(str.substring(0,str.length()-1)) + 1;
		      }
		      else{
		        return countAbc(str.substring(0,str.length()-1)) + 0;
		      }
		   }
		   else{
		     return 0;
		   }
		}
	public static void main(String[] args) {
		
       Scanner kb=new Scanner(System.in);
       String s=kb.nextLine();
       System.out.print(countAbc(s));
       
	}

}
