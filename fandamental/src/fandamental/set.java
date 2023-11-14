package fandamental;

 class sett{
	private int length,height,breth;
	public void setDimention(int l,int h,int b) {
		length=l;
		height=h;
		breth=b;
			}
	public void showDimention() {
		System.out.println("lenght is"+length);
		System.out.println("height is"+height);
		System.out.println("breth is"+breth);
	}

//	sett.setDimention(1,2,3);
//	sett.showDimention();
}
public class set{
	public static void main(String args[]) {
		sett ob=new sett();
		ob.setDimention(2, 3, 4);
		ob.showDimention();
	}
}