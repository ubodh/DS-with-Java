package stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackUseArrays stack=new StackUseArrays (52);
//		stack.push(10);
//		stack.push(10);
//		stack.push(10);
//		stack.push(10);
//		stack.push(10);
//		stack.push(10);
//		
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		//int x=stack.top();
		//stack.pop();
		int y=stack.size();
		//boolean bol=stack.isEmpty();
		System.out.print(y);
		int arr[]= {1,2,3,4,5,6};
		for(int i:arr) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.top());
			stack.pop();
		}
		
	}

}
