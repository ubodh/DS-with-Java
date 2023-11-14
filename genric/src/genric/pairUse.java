package genric;

public class pairUse {

	public static void main(String[] args) {
		pair<String,Integer>pInner=new pair<String,Integer>("Ayush",12);
		pair<pair<String,Integer>,String>p=new pair<pair<String,Integer>,String>();
		p.setFirst(pInner);
//		p.setFirst(pInner.setSecond("subod"));
		p.setSecond("subodh");
		//pair<Integer>pI=new pair<Integer>(10,20);
		 System.out.println(p.getFirst().getFirst()+ " "+p.getFirst().getSecond());
		 System.out.println(p.getSecond());
			
		//pair<Integer>pI=new pair<Integer>(10,20);
		// System.out.println(p.getFirst()+ " "+p.getSecond());
			
//		pair<String ,Integer>pSI=new pair<String,Integer>("aba",10);
//		pSI.setFirst("subod");
//		//pair<Integer>pI=new pair<Integer>(10,20);
//		 System.out.println(pSI.getFirst()+ " "+pSI.getSecond());
			
//		pair<String>p1=new pair<>();
//		p1.setFirst("subodh");
//		//pair<Integer>pI=new pair<Integer>(10,20);
//		 System.out.println(p1.getFirst()+ " "+p1.getSecond());
//			
//		 int i=10;
//		 Integer i1=10;//null
////		// TODO Auto-generated method stub
//pair p=new pair(10,20);
////p.setFirst("aa");
////p.setFirst(10);
//String f=(String)p.getFirst();
//System.out.println(p.getFirst()+ " "+p.getSecond());
// pair<String>ps=new pair<>("aa","bb");
// System.out.println(ps.getFirst()+ " "+ps.getSecond());
//// ps.setFirst("10");
// pair<Integer>pI=new pair<Integer>(10,20);
// System.out.println(pI.getFirst()+ " "+pI.getSecond());
//	
//	pair<Double>pD;
//	pD=new pair<Double>(10.8,20.9);
//	 System.out.println(pD.getFirst()+ " "+pD.getSecond());
//	 
//	 pair<Vehicle>pV=new pair<Vehicle>(new Vehicle(),new Vehicle());
//	 System.out.println(pI.getFirst()+ " "+pI.getSecond());
//		}
		}
}
