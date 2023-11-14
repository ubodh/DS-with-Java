/**
 * 
 */
package javaKeProgram.java;

/**
 * @author subodh kumar
 *
 */
public class paitern {

	/**
	 * @param args
	 */
//	public static void incrementArray(int arr[]) {
//		arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=arr[i]+1;
//		}
//	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) 
			System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,2,3,4,5};
	      //incrementArray(arr);
	      printArray(arr);
	     // System.out.println(arr[0]);   

	}

}
