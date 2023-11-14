package Test;
import java.util.Stack;
public class use3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk=new Stack<Integer>();
		int arr[]= {1,2,3,4};
		for(int i:arr) {
			stk.push(i);
		}
		int temp=stk.pop();
		System.out.print(temp);
		System.out.print(stk);

	}

}
