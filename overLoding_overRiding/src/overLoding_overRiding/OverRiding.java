package overLoding_overRiding;

class A{
	
	void fun1(int x) {
		System.out.println("class A");
	}
}
class B extends A{
	
	void fun2(int x) {
		System.out.println("class B");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
	     ob.fun2(2);// class B
		//ob.fun1(3);//class A

	}

}
