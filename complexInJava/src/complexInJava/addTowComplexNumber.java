package complexInJava;
class Complex{
	int x;
	int y;
	Complex(int x,int y){
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println(x+"+"+'i'+y);
	}
  public static Complex add(Complex c1,Complex c2) {
	  Complex temp=new Complex(0,0);
		temp.x=c1.x+c2.x;
		temp.y=c1.y+c2.y;
		return temp;
	}
  public static Complex multi(Complex c1,Complex c2) {
	  Complex temp=new Complex(0,0);
		temp.x=c1.x*c2.x-(c1.y*c2.y);
		temp.y=c1.x*c2.y+c1.y*c2.x;
		return temp;
	}
  public static Complex subt(Complex c1,Complex c2) {
	  Complex temp=new Complex(0,0);
		temp.x=c1.x-c2.x;
		temp.y=c1.y-c2.y;
		return temp;
	}
}
public class addTowComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(2,3);
		c1.print();
		Complex c2 =new Complex(2,3);
		c1.print();
		Complex c3=Complex.add(c1,c2);
		c3.print();
		Complex c4=Complex.multi(c1, c2);
		c4.print();
		Complex c5=Complex.subt(c1,c2);
		c5.print();
		

	}

}
