package complexInJava;
public class fractionToPrint{
      int nomerator;
      int denomirator;
      fractionToPrint(int nomerator ,int denomirator){
    	  this.nomerator=nomerator;
    	  this.denomirator=denomirator; 
    	  simply();
      }
//      static void add1(fractionToPrint f1,fractionToPrint f) {
// 		 int ff=f1.nomerator*f.denomirator+f1.denomirator*f.nomerator;
// 		 int fff=f1.denomirator*f.denomirator;
// 		// simply();
// 		 System.out.print(ff+"/"+fff);
// 	}
      static void add1(fractionToPrint f1,fractionToPrint f) {
  		 int ff=f1.nomerator*f.denomirator+f1.denomirator*f.nomerator;
  		 int fff=f1.denomirator*f.denomirator;
  		// simply();
  		 System.out.print(ff+"/"+fff);
  	}
      private  void simply() {
		// TODO Auto-generated method stub
		int min=Math.min(nomerator, denomirator);
		int hcf=1;
		for(int i=2;i<=min;i++) {
			if(nomerator%i==0 && denomirator%i==0) {
				 hcf=i;
			}
		}
		this.nomerator=nomerator/hcf;
		this.denomirator=denomirator/hcf;
	}
      void increment() {
    	  this.denomirator=denomirator;
    	  this.nomerator=nomerator+denomirator;
    	  //simply();
      }
	void print() {
    	  System.out.println(nomerator+"/"+denomirator);
      }
   public static fractionToPrint plus(fractionToPrint f1,fractionToPrint f) {
	   fractionToPrint temp=new fractionToPrint(0,0);
		temp.nomerator=f1.nomerator*f.denomirator+f1.denomirator*f.nomerator;
		temp.denomirator=f1.denomirator*f.denomirator;
		
		//simply();
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fractionToPrint f=new fractionToPrint(1,3);
		//f.print();
		f.increment();
		fractionToPrint f1=new fractionToPrint(4,16);
		fractionToPrint f3=plus(f1,f);
		
		f3.print();


	}

}
