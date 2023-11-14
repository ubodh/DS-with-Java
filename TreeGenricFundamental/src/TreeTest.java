import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {
	
	//private static final int TreeNode = 0;
	
	public static void printTree(TreeNode<Integer> root){
		//Not a base case but an edge case
		if (root == null)
		return;
		System.out.println(root.data); //Print current node's data
		for (TreeNode<Integer> child : root.children)
		printTree(child); //Recursively call the function for children
	}
	private static int countNode(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			
		int childCound=	countNode(root.children.get(i));
			count=count+childCound;
		}
		return count;
	}

	private static void printLevelWise(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		System.out.print(root.data+":  ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
			
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer>child=root.children.get(i);
			printLevelWise(child);
		}
		
	}
	private static void print(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		// pree order printed
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer>child=root.children.get(i);
			print(child);
		}
		
	}
	public static void preorder(TreeNode<Integer> root){
		if(root == null) {
		return;
		}
		System.out.println(root.data);
		for(int i = 0; i < root.children.size(); i++) {
		preorder(root.children.get(i));
		}
		}
	public static TreeNode<Integer> takeTreeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root Data");
		int rootData = s.nextInt(); //TAKE USER INPUT
		if (rootData == -1) //Stop taking inputs
		return null;
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children for "+ rootData);
		int childrenCount = s.nextInt(); //Get input for no. of child nodes
		while(childrenCount > 0){
		TreeNode<Integer> child = takeTreeInput(); //Input for all childs
		root.children.add(child); //Add child
		 childrenCount--;
		 }
		return root;
		}
	public void printAtLevelK(TreeNode<Integer> root, int k){
		if(root == null) { // Edge case
		return;
		}
		if(k == 0) { // Base case: when the depth is 0
		System.out.println(root.data);
		return;
		}
		for(int i=0; i<root.children.size(); i++) { // Iterating over each
		//child and
		printAtLevelK(root.children.get(i), k - 1); // recursively calling
		//with with 1 depth less
	}
}
	public TreeNode<Integer> takeTreeInputLevelwise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root Data");
		int rootData = s.nextInt(); //TAKE USER INPUT
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root); // Root data pushed into queue at first
		while(pendingNodes.size() != 0){ //Runs until the queue is not empty
		TreeNode<Integer> front = pendingNodes.poll(); //stores front
		//pendingNodes.pop();// deleted that front node stored previously
		System.out.println("Enter num of children of "+front.data);
		int numChild = s.nextInt();// get the number of child nodes
		for (int i=0; i<numChild; i++) { // iterated over each
		//child node to input it
		System.out.println("Enter "+i+"th child of "+front.data);
		int childData = s.nextInt();
		TreeNode<Integer> child = new TreeNode<>(childData);
		front.children.add(child); //Each child node is pushed
		//into the queue as well as the list of child
		//nodes as it is taken input so that next
		// time we can take its children as input while
		//we kept moving in the level-wise fashion
		pendingNodes.add(child);
		}
	}
		return root; // Finally returns the root node
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeNode<Integer> root =new  TreeNode<Integer>(4);
TreeNode<Integer> root1 =new  TreeNode<Integer>(2);
TreeNode<Integer> root2 =new  TreeNode<Integer>(3);
TreeNode<Integer> root3 =new  TreeNode<Integer>(1);
TreeNode<Integer> root4 =new  TreeNode<Integer>(5);
TreeNode<Integer> root5 =new  TreeNode<Integer>(6);

root.children.add(root1);
root.children.add(root2);
root.children.add(root3);


root2.children.add(root4);
root2.children.add(root5);
print(root);
System.out.println();
printLevelWise(root);
System.out.println();
System.out.println("total node is="+countNode(root));
printTree(root);

	}
	
	

	

}
