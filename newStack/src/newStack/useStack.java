package newStack;

import stacks.StackEmptyException;
import stacks.StackUsingLL;

public class useStack {

		public static void main(String args[]) throws StackEmptyException {
			StackUsingLL stack=new StackUsingLL();
			int arr[]= {1,2,3,4};
			for(int i:arr) {
				stack.push(i);
			}
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
				
			}
			System.out.println("size="+stack.size());

	}

}
