package oops;

public class parametrizedConstructor1 {
 String s;
 int i;
 parametrizedConstructor1(String s,int i){
	 this.s=s;
	 this.i=i;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametrizedConstructor1 prC1=new parametrizedConstructor1("subodh",1212);
		parametrizedConstructor1 prC2=new parametrizedConstructor1("sks",12);
		System.out.println(prC1.s+" "+prC1.i);
		System.out.println(prC2.s+" "+prC2.i);
	}

}
