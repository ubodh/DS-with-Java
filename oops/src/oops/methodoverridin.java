package oops;
class A{
	void show() {
		System.out.print('A');
	}
	
}
class B extends A{
	void show() {
		System.out.print('B');
	}
}
public class methodoverridin extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverridin ss=new methodoverridin();
		ss.show();
         A a=new A();
         A.show();
         B b=new B();
         B.show();
	}

}
