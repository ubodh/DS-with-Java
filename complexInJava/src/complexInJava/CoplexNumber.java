package complexInJava;

public class CoplexNumber {
	int x;
	int y;
	CoplexNumber(int x,int y){
		this.x=x;
		this.y=y;
	}
	void print() {
		System.out.println(x+"+ "+'i'+y);
	}
	static CoplexNumber add(CoplexNumber c1,CoplexNumber c2) {
		CoplexNumber temp=new CoplexNumber(0,0);
		temp.x=c1.x+c2.x;
		temp.y=c1.y+c2.y;
		return temp;
	}
          void add1(CoplexNumber c2) {
        	  this.x=this.x+c2.x;
        	  this.y=this.y+c2.y;
          }
         static  void add2(CoplexNumber c1,CoplexNumber c2) {
        	  int x1=c1.x+c2.x;
        	   int y1=c1.y+c2.y;
        	   System.out.println(x1+"+"+'i'+y1);
        	 
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            CoplexNumber c1=new CoplexNumber(2,3);
            //c1.print();
            CoplexNumber c2=new CoplexNumber(2,3);
            CoplexNumber c3=add(c1,c2);
            //c3.print();
            c1.add1(c2);
            //c1.print();
            add2(c1,c2);
            
	}

}
