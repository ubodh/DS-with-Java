package wrapperclass;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1>valueOf()
		 * ->Static method
		 * ->return Object reference of relative wrapper class
		 * (2)parseXxx()
		 * ->Static method
		 * ->Xxx can be replaced by any primitive type
		 * ->it returns Xxx type value
		 * (3)XxxValue()
		 * ->Instance method of wrapper class
		 * ->Xxx can be replaced by any primitive type
		 * ->Returns corresponding primitive type
		 * 
		 */
		Integer i1=Integer.valueOf("1212");
		Integer i2=Integer.valueOf("1010110",2);
		Integer i3=Integer.valueOf("sus");
		Double d1=Double.valueOf("22.22");
		int ii=Integer.parseInt("121");
		double d=Double.parseDouble("22.22");
	    int x=i1.intValue();
	    double y=d1.doubleValue();
		
		

	}

}
