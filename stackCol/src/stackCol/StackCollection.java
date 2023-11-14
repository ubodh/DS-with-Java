package stackCol;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> sk=new Stack<Integer>();
		sk.push(111);
		System.out.println("size="+sk.size());
		System.out.println("------------");
		System.out.println("peek element one="+sk.peek());
		System.out.println("------------");
		int arr[]= {1,2,3,4,5};
		for(int i:arr) {
			sk.push(i);
		}
		System.out.println("____-------");
		System.out.println("peek element one="+sk.peek());
		System.out.println("delation of element"+sk.pop());
		while(!sk.isEmpty()) {
			System.out.println(sk.pop());
		}
		System.out.println(sk.size());

	}

}
