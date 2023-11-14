package stacks;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLL stack= new StackUsingLL();
		int arr[]= {1,2,2,3,4};
		for(int i:arr) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" ");
			//stack.pop();
		}
//		while(!stack.isEmpty()) {
//			System.out.print(stack.top()+" ");
//			stack.pop();
//		}
		System.out.println("---------");
		System.out.print(stack.size());

	}

}
