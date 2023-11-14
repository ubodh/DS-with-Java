package StringFandamental;

import java.util.Scanner;

public class checkRightTrigle {
	
  public static boolean isRight(int a,int b,int c) 
  {
	  //a is base ,b is height ,c is hipotenuos 
	  if(a+b>c && b+c>a && c+a>b) {
		  
	  
		 int temp=(c*c);
		  if(temp==(a*a+b*b))
			  return true;
	  }else
		  return false;
	  
	return false;	 
		  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(isRight(a,b,c))
			System.out.print("it is right angle tringle");
		else
			System.out.print("it not right angle tringle");
		

	}

}
