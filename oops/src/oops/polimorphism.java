package oops;

public class polimorphism {
	int  show() {
		System.out.print("one");
		return 1;
	}
	void show() {//same  function (method) name and same argument is error 
		System.out.println("two");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                polimorphism pol=new polimorphism();
                pol.show();
                pol.show();
	}

}
