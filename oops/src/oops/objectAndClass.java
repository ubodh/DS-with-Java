package oops;

public class objectAndClass {

	public void eat() {
		System.out.println("i am eating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.out.println(1);
             objectAndClass bujo=new objectAndClass();
             bujo.eat();
             bujo.run();
             objectAndClass bujo1=new objectAndClass();
             bujo1.run();
             bujo1.eat();
            // bujo1.flay();  error because out of class accessible is not possible
             bird sp=new bird();
             sp.flay();
	}
	public void run() {
   	 System.out.println("i am running");
    }
}
class bird{
	public void flay() {
		System.out.print("i am flay");
	}
}
