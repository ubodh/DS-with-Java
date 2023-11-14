package sort;

public class StringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="aabccc";
		 int arr[]=new int[128];
		 for(int i=0;i<s.length();i++) {
			// System.out.println(s.charAt(i));
			 char x=s.charAt(i);
			 int t=(x);
			 arr[t]++;
			 //System.out.print(t);
		 }
		 int max=Integer.MIN_VALUE;
		 int j=-1;
		 for(int i=0;i<128;i++ ) {
			   if(arr[i]>max) {
				   max=arr[i];
				   j=i;
			   }
		 }
		 char ch= (char)j;
		 System.out.print(ch);
//		 for(int i=0;i<128;i++) {
//			 System.out.println(arr[i]);
//		 }

	}

}
