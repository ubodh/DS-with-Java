package oops;
class parentClass{
	void show() {
		System.out.println("this is parentClass");
	}
}

public class singleInheritence extends parentClass{
           void show2() {
        	   System.out.println("this is child class");
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentClass pc=parentClass();	
		//pc.show();       // Through out  error because child class object create of parent class
		singleInheritence pc1=new singleInheritence();
		pc1.show2();
		pc1.show();

	}
	private static parentClass parentClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
