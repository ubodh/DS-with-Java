package TreeFaundation;
class pair{
	int height;
	int diameter;
	public pair(int height,int diameter) {
		this.height=height;
		this.diameter=diameter;
	}
}
class Solution{
	private static pair diameterHelp(BinaryTreeNode<Integer> root) {
		if(root==null) {
			pair ob=new pair(0,0);
			return ob;
		}
		pair leftOb=diameterHelp(root.left);
		pair rightOb=diameterHelp(root.right);
		int hei=leftOb.height+rightOb.height+1;
		int diameter=Math.max(hei, Math.max(leftOb.diameter,rightOb.diameter));
		int height=Math.max(leftOb.height, rightOb.height);
		return (new pair(diameter,height));
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root):
		pair ob=diameterHelp(root);
	return ob.diameter;
}
public class DiemeterOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
