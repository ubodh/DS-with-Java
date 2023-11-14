package sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class removeAllPrime {

	public static boolean isPrime(int x) {
		// TODO Auto-generated method stub
		int i=2;
		for(;i<=x;i++) {
			if(x%i==0)
			return false;
		}
		//if(i==x)
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>arr=new ArrayList();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		solution(arr);
		System.out.print(arr);

	}

	private static void solution(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		for(int i=arr.size()-1;i>=0;i--) {
			int x=arr.get(i);
			if(isPrime(x)==true) {
				arr.remove(i);
			}
		}
		
	}

}
