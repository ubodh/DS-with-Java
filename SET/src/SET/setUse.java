package SET;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Set<Integer> set=new HashSet<Integer>();
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             for(int i=0;i<n;i++) {
            	 int x=sc.nextInt();
            	 set.add(x);
             }
             System.out.print(set);
             
	}

}
