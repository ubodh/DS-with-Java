package Array;

 class complex11{
	int x1;
	int y1;
	complex11(int x1,int y1){
		this.x1=x1;
		this.y1=y1;
	}
	void display() {
		System.out.print(x1+"+"+'i'+y1);
	}
	public static complex11 multi(complex c1,complex c2) {
		// complex temp=new complex(0,0);
		 // (2+3i)(
		 int xx=c1.x1*c2.x-(c1.y1*c2.y1);
		 int yy=c2.y1*c1.x1+c1.y1*c2.x1;
		 complex11 temp=new complex11(xx,yy);
		return temp; 
	}
}
public class multiplicationOFComplex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex11 c1=new complex11(2,3);
		complex11 c2=new complex11(2,3);
		complex11 c3=complex11.multi(c1,c2);
		c3.display();
	}
}
