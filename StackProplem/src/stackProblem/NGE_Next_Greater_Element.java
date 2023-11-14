package stackProblem;

import java.util.Stack;

//Default initialization of Stack
//Stack stack1 = new Stack();
//Initialization of Stack
//using Generics
//Stack<String> stack2 = new Stack<String>();
//stack1.push("4");
//stack2.push("Geeks");
//System.out.println("Popped element: "+ stack.pop());
//System.out.println("The element at the top of the"+ " stack is: " + stack.peek());

public class NGE_Next_Greater_Element {
	
	// 3 1 5 8=>5 5 8 -1 
	
	private static int[] NGE_Optimise(int[] arr) {
		// TODO Auto-generated method stub
		// code is optimese
		Stack<Integer>stk=new Stack<>();
		int n=arr.length;
		int ans[]=new int[n];
		int k=0;
		
		for(int i=n-1;i>=0;i--) {
			if(stk.size()==0) {
				ans[k++]=-1;
			}	
		if(stk.peek()>arr[i]) 
			stk.push(stk.pop());
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,5,8};
	
		int arr1[]=NGE_BruteForce(arr);
		int arr2[]=NGE_Optimise(arr);
		
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i:arr2) {
			System.out.print(i+" ");
		}

	}

	private static int[] NGE_BruteForce(int[] arr) {
		// TODO Auto-generated method stub
		// 3 1 5 8=>5 5 8 -1 
		 //Brute force 
		int ans[]=new int [arr.length];
		int n=arr.length;
		int k=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					ans[k++]=arr[j];
					break;
				}
			}
		}
		ans[arr.length-1]=-1;
		
		return ans;
	}
}
