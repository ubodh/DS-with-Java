package classAndObjec;
/*
 * ->in C++
 * 1>Box b1;
 * 2>Box *p=new Box();
 * ---------------
 * =>in java
 * 1> Box b=new Box();
 */
public class Box {
      private int length,height,weight;
      public void setBox(int length,int height,int weight) {
    	  this.length=length;
    	  this.height=height;
    	  this.weight=weight;
      }
      public void showBox() {
    	  System.out.println("length"+"="+length);
    	  System.out.println("height"+"="+height);
    	  System.out.println("weight"+"="+weight);
      }
	public static void main(String args[]) {
		// TODO Auto-generated method stub
          Box b1=new Box();
          b1.setBox(1,2,3);
          b1.showBox();
          b1=new Box();
          b1.showBox();
	}

}
