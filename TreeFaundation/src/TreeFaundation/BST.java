package TreeFaundation;
public class BST {
private BinaryTreeNode<Integer>root;
private int size;
 
private static  boolean isPresentHelper(BinaryTreeNode<Integer>root,int x) {
	 if(root==null)
	 return false;
	 if(root.data==x)
		 return true;
	 if(root.data>x) {
		 //call left side;
		 return isPresentHelper(root.left, x);
	 }else {
		 //call on the right side4
		return  isPresentHelper(root.right,x);
	 }
}
 public boolean isPresent(int x) {
	 return isPresentHelper(root,x);

 }
 public void insert(int x) {
	 root=insert(root,x);
	  size++;
 }
 
 private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer>root,int x){
	 if(root==null) {
		 BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<Integer> (x);
		 return newRoot;
	 }
	 if(x>=root.data) {
		 root.right=insert(root.right,x);
	 }else {
		 root.left=insert(root.left,x);
	 }
	 return root;
 }

 public class BSTDeleteReturn{
	 BinaryTreeNode<Integer>root;
	 boolean deleted;
	  public BSTDeleteReturn(BinaryTreeNode<Integer>root,boolean deleted) {
		// TODO Auto-generated constructor stub
		  this.root=root;
		  this.deleted=deleted; 
	}
 }
 public boolean deleteData(int x) {
	    BSTDeleteReturn output= helpDelteNode(root,x);
	    root=output.root;
	    if(output.deleted) {
	    	size--;
	    }
	    return output.deleted;
 }
 private BSTDeleteReturn helpDelteNode(BinaryTreeNode<Integer> root, int x) {
	 
	 if(root==null) {
		 return new BSTDeleteReturn(null,false);
	  }
	 
	  if(root.data<x) {
		  BSTDeleteReturn outputRight= helpDelteNode(root.right,x);
		  root.right=outputRight.root;
		  outputRight.root=root;
		  return outputRight;
	            }
	  
	  if(root.data>x) {
		  BSTDeleteReturn outputLeft= helpDelteNode(root.left,x);
		  root.left=outputLeft.root;
		  outputLeft.root=root;
		  return outputLeft;
	          }
	  
	  // 0 children 
		  if(root.left==null && root.right==null) {
			  return new BSTDeleteReturn(null,true);
            		  }
		 		  
		  // only left child
		   if(root.left!=null && root.right==null) {
			   return new BSTDeleteReturn(root.left,true);  
		              }
		   
		   
		   //only right child
		   if(root.left==null && root.right!=null){
			   return new BSTDeleteReturn(root.right,true);
				
		   }
				  
		   
				  // both children are present 
				  int rightMin=minimum(root.right);
				  root.data=rightMin;
				  BSTDeleteReturn outputRight=helpDelteNode(root.right,rightMin);
				  root.right=outputRight.root;
				  	
				  return new BSTDeleteReturn(root,true);
			         }
 
 
public int size() {
	// int size1=printTreeLengthHelper(root);
	 return size;
 }
 private static int minimum(BinaryTreeNode<Integer> root2) {
	 if(root2==null)
	 return Integer.MAX_VALUE;
	 
	 int x=minimum(root2.left);
	 int y=minimum(root2.right);
	 return Math.min(root2.data,Math.min(x, y));
	// TODO Auto-generated method stub

}
private static void printTreeHelper(BinaryTreeNode<Integer>root) {
	 if(root==null)
		 return;
	 System.out.print(root.data+" ");
	 if(root.left!=null) {
		 System.out.print("L"+root.left.data+" ");
	 }
	 if(root.right!=null) {
		 System.out.print("R"+root.right.data+" ");
	 }
	 System.out.println();
	 printTreeHelper(root.left);
	 printTreeHelper(root.right);
 }

 public void printTree() {
	 printTreeHelper(root);
 }
}
