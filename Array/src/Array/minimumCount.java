package Array;

import java.util.Scanner;

public class minimumCount {
            public static int minCount(int n) {
            
            	int min=-1;
            	int sum=0;
				for(int i=0;i<n;i++) {	
	
					for(int j=i;i==0;j--) {
					sum=(int) (sum+Math.pow(2,2));
					if(sum!=n)
						continue;
				}
					for(int p=0;p<n;p++) {
						 if(sum==n)
						 {
							 min= i;
						 }
						 else {
							 sum=sum+1;
						 }
					}
				}
				return min;
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
            System.out.print(minCount(n));
	}

}

