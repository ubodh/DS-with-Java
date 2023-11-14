package oops;
 class apnu{
	 apnu(){
		 System.out.println("hi");
	 }
	 void print() {
		 System.out.println("hi am print when call is super keyword");
	 }
 }
public class userDefinedConstructor extends apnu {
		userDefinedConstructor(){// user defined constructor 
            	// constructor is call when object created
			super.print();

		System.out.println("This is constructor call without argument");
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDefinedConstructor c=new userDefinedConstructor();
		

	}

}
