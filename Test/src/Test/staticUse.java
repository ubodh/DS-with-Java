package Test;

  class A1{
	void f1() {
		System.out.println("Enter in f1 function");
	}
	static void f2() {
		System.out.println("Enter in static f2 function");
	}
}
public class staticUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A1 a1=new A1();
      a1.f1();
      a1.f2();
	}

	

}
