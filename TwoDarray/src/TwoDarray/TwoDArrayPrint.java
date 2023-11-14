package TwoDarray;

import java.util.Scanner;

public class TwoDArrayPrint {
                         public static void print2D(int arr[][]) 
                         {
                             	     for(int i=0;i<arr.length;i++){
                             	    	 
                          	  		 for(int j=0;j<arr[0].length;j++){
                          	  			 
                          			 System.out.print(arr[i][j]+" ");
                          			 
                        		          } 
                          	  		 
                        		        System.out.println();
                        		    }
                        	   
                         }
                        	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
                 print2D(arr);
	}

}
