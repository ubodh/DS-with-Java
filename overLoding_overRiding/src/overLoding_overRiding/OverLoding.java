package overLoding_overRiding;

class C{
	
	void fun1(int x) {
   System.out.println("class A");
	}
}

class D extends C{
	
	void fun1(int x,int y) {
		System.out.println("class B");
	}
}

public class OverLoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob =new D();
		ob.fun1(1,2);
		ob.fun1(3);

	}

}
