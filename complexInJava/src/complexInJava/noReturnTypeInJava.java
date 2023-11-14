package complexInJava;
class Complex11{
	int x;
	int y;
	Complex11(int x,int y){
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println(x+"+"+'i'+y);
	}
	void add(Complex11 c2) {
		int t=this.x;
		this.x=(this.x*c2.x)-(this.y*c2.y);
    	this.y=c2.y*t+this.y*t;
	}
}

public class noReturnTypeInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex11 c1=new Complex11(3,6);
		c1.print();
		Complex11 c2=new Complex11(7,9);
		c1.add(c2);
		c1.print();
	}
}
