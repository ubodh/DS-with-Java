package Array;
class complex1{
	int x;
	int y;
	complex1(int x,int y){
		this.x=x;
		this.y=y;
	}
	void disply() {
		System.out.println(x+"+"+'i' +y);
	}
	public  complex1 add1(complex1 c1) {
		complex1 t= new complex1(0,0);
     				     t.x=this.x+c1.x;
     					 t.y=this.y+c1.y;
     	    			return t ;
     	     }
	public static complex1 add(complex1 c1,complex1 c2) {
		complex1 temp= new complex1(0,0);
		 temp.x=(c1.x*c2.x)-(c1.y*c2.y);
		 temp.y=(c2.y*c1.x+c1.y*c2.x);
		return temp; 
	}
	public  void add2(complex1 c1,complex1 c2) {
		//complex1 temp= new complex1(0,0);
		x=c1.x+c2.x;
		y=c1.y+c2.y;
		System.out.print(x+ "+"+'i'+y);
		//return temp;
	}
	
}
public class complex {

         public static final int x1 = 0;

		public static void main(String args[]) {
        	 complex1 c=new complex1(2,3);
        	 //c.disply();
        	 complex1 c1=new complex1(5,7);
        	// c1.disply();
            complex1 c3=c.add1(c1);
        //	c3.disply();
        	
        	complex1 c4=new complex1(2,3);
       	 //c.disply();
       	 complex1 c5=new complex1(5,7);
       	 //c1.disply();
       	complex1 c6=complex1.add(c4,c5);
    	c6.disply();	
        	
    	complex1 c7=new complex1(2,3);
      	// c.disply();
      	 complex1 c8=new complex1(5,7);
      	 //c1.disply();
      	 
      	//add2(c7,c8);
   	//c.disply();	
         }
        	 
        

		private static void add2(complex1 c7, complex1 c8) {
			// TODO Auto-generated method stub
			int x=c7.x+c8.x;
		   int y=c7.y+c8.y;
			System.out.print(x+ "+"+'i'+y);
			//return temp;
			
		}
   	
		private static complex1 add(complex1 c, complex1 c1) {
			// TODO Auto-generated method stub
			 complex1 t= new complex1(0,0);
		     t.x=c.x+c1.x;
			 t.y=c.y+c1.y;
	         return t ;
		}

		public int y;
	
		}
