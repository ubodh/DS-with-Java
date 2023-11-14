package oops;
class ff{
	 final void show() {
		System.out.print("hello");
	}
}
public class fnalKeyword1 extends ff {
          void show() {// here not overiding because ff class in final keyword not any function overide
        	  System.out.print("not hello");
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
