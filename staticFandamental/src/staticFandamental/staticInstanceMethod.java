package staticFandamental;

public class staticInstanceMethod {

	int x;//Instance variable
	static int y;//Static memebr variable
	public void fun() {}//Instance member fuction
	/*
	 * public void fun() {y=3}//here is error because Instance member fuction in not acess to static member functio
	 */
	public static void fun2() {}//static member function
	/*
	 * public static void fun2(){x=2;}//here is error because  x is not static member so not acess
	 */
	static class Test{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*->Static member variable
 * 
 * ->static member function
 * 
 * ->and not static variable in method
 * 
 * ->but we can have static inner class
 * 
 */
		staticInstanceMethod obj=new staticInstanceMethod ();
		staticInstanceMethod  obj1=new staticInstanceMethod ();
		staticInstanceMethod.y=2;//y=2;
		staticInstanceMethod .fun2();
		//or fun2();
	}

}
/* calss Example{
 *    int x;
 *    
 *   static int y;
 *   
 *   public static void fun1(){}
 *   
 *   public void fun(){}
 *   
 *   static class Test{//inner class
 *   public static String country="INDIA";
 *     }
 *     }
 *     public class A{
 * 
 *   public static void main(String args[]){
 *   Example ex=new Example();
 *   Example ex1=new Example();
 *   Example.y=3;
 *   Example.fun1();
 *   System.out.print(Example.Test.country);
 *   Example.Test.country like System.out.print()
 */
 
