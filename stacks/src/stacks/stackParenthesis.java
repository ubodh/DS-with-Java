package stacks;
import java.util.Scanner;
import java.util.Stack;
public class stackParenthesis {
	

	    public static boolean isBalanced(String expression) {
	        //Your code goes here
	        
	        int n=expression.length();
	        if(n==0) return  true;
	        Stack<Character>temp=new Stack<Character>();
	         //temp.push(expression.charAt(0));
	        for(int i=0;i<n;i++){
	                     if(expression.charAt(i)=='{' || expression.charAt(i)=='[' || expression.charAt(i)=='(' ){
	                                   temp.push(expression.charAt(i));
	                                                  } 

	                          else if( expression.charAt(i)==']' || expression.charAt(i)=='}' || expression.charAt(i)==')'){
	                                     if(temp.isEmpty()) return false;
	                                    else
	                                 temp.pop();
	                          }
	                                            else 
	                                                   return false;
	        }
	        return  temp.isEmpty();
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.print(isBalanced(str));

	}

}
