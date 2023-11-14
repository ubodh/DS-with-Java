package oops;

public class parametrizedConstructor {
	parametrizedConstructor(int a){
		System.out.print("this is parametrized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parametrizedConstructor prC=new parametrizedConstructor();//this is an error because not parameter  passed throught this constructor
		parametrizedConstructor prC=new parametrizedConstructor(2);
	}

}
