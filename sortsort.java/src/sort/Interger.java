package sort;

import java.util.Scanner;

public class Interger {
	/*          *
	 *         * *  
	 *      *  *
	 */

	public  static void main(String args[]) {
		for(int k=1;k<=5;k++) {
		 for(int i=1;i<=5-k;i++) {
			 System.out.print(" ");
		    }
			 for(int j=1;j<=2*k-1;j++) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }
	}
}
