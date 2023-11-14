package TreeFoundation;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

import TreeFaundation.BinaryTreeNode;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter root data");
		Scanner sc=new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeInput();
		BinaryTreeNode<Integer> rightChild=takeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot ,int pairentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}
		else {
			if(isLeft) {
				System.out.println("Enter left child of "+pairentData);
			}
			else {
				System.out.println("Enter right child of "+pairentData);
			}
		}
	//	System.out.println("Enter root data");
		Scanner sc=new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		
		BinaryTreeNode<Integer> leftChild=takeInputBetter(false ,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeInputBetter(false ,rootData, false);
		
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	public static void printTree(BinaryTreeNode<Integer>root) {
		if(root==null)
			return ;
			System.out.print(root.data+":");
			if(root.left!=null) {
				System.out.print("L"+root.left.data+" ,");
			  }
			
			if(root.right!=null) {
				System.out.print("R"+root.right.data+" ");
			     }
			System.out.println();
			
			printTree(root.left);
			printTree(root.right);
			
			
//			if(root.left!=null) {
//		     printTree(root.left);
//			}
//			if(root.right!=null) {
//		     printTree(root.right);
//			}
	}
	public static void printTreeDetail(BinaryTreeNode<Integer>root) {
		if(root==null) return ;
		System.out.print(root.data+" ");
		printTreeDetail(root.left);
		printTreeDetail(root.right);
		
	}
	
public static int numNodes(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return 0;
	}
    int leftNodeCount=numNodes(root.left);
	int rightNodeCount=numNodes(root.right);
	return 1+leftNodeCount+rightNodeCount;
}
public static void postOrder(BinaryTreeNode<Integer> root) {
	//Your code goes here
	if(root==null){
		return ;
	}
	postOrder(root.left);
	
	postOrder(root.right);
	System.out.print(root.data+" ");

 	}
public static void preOrder(BinaryTreeNode<Integer> root) {
	//Your code goes here\
	if(root==null){
		return ;
	}
	System.out.print(root.data+" ");
	preOrder(root.left);
	
	preOrder(root.right);
 	}
public static void inOrder(BinaryTreeNode<Integer> root) {
	//Your code goes here\
	if(root==null){
		return ;
	}
	inOrder(root.left);
	System.out.print(root.data+" ");
	//inOrder(root.left);
	
	inOrder(root.right);
 	}
public static int largest(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return -1;
	}
	int xleft=largest(root.left);
	int xright=largest(root.right);
	int y=Math.max(root.data,Math.max(xleft, xright));
	return y;
}
public static int numLeaves(BinaryTreeNode<Integer>root) {
	if(root==null) return 0;
	if(root.left==null && root.right==null ) {
		return 1;
	}
	return numLeaves(root.left)+ numLeaves(root.right);
}
public static void printAtDepthK(BinaryTreeNode<Integer>root,int k) {
	if(root==null) return ;
	if(k==0) {
		System.out.print(root.data+" ");
	    return ;
	}
	printAtDepthK(root.left,k-1);
	printAtDepthK(root.right,k-1);
	
	}
 public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer>root){
	 
	 if(root==null) 
		 return null;
	 
	 if(root.left==null && root.right==null) 
		 return null;
	 
	 root.left=removeLeaves(root.left);
	 root.right=removeLeaves(root.right);
	 
	 return root;
 }
public static BinaryTreeNode<Integer> solve(BinaryTreeNode<Integer> root){
	           if(root==null){
				   return null;
			   }
			   solve(root.left);
			   solve(root.right);
			   BinaryTreeNode<Integer> temp=root.left;
			   root.left=root.right;
			   root.right=temp;
			   return root;

}
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		BinaryTreeNode<Integer> root1=solve(root);
		return ;
	}
public static int height(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return 0;
	}
	int x=height(root.left);
	int y=height(root.right);
	return Math.max(x, y)+1;
}
public static boolean isBalaneced(BinaryTreeNode<Integer>root) {
	if(root==null) {
		return true;
	}
	int Lh=height(root.left);
	int Rh=height(root.right);
	if(Math.abs(Lh-Rh)>1) {
		return false;
	}
	boolean isL=isBalaneced(root.left);
	boolean isR=isBalaneced(root.right);
	return  isL&&isR;
	
}
public static BalenceTreeReturn isBalencedBetter(BinaryTreeNode<Integer>root) {
	if(root==null) {
		int height=0;
		boolean isBal=true;
		BalenceTreeReturn ans=new BalenceTreeReturn();
		ans.height=height;
		ans.isBalenced=isBal;
		return ans;
	}
	BalenceTreeReturn Lo=isBalencedBetter(root.left);
	BalenceTreeReturn Ro=isBalencedBetter(root.right);
	boolean isBal=true;
	int hei=1+Math.max(Lo.height,Ro.height);
	if(Math.abs(Lo.height-Ro.height)>1)
		isBal=false;
	if(!Lo.isBalenced || Ro.isBalenced) {
		isBal=false;
	}
	BalenceTreeReturn ans=new BalenceTreeReturn();
	int height = 0;
	ans.height=height;
	ans.isBalenced=isBal;
	return ans;
		
}
public static BinaryTreeNode<Integer> takeInputLevelWise(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter root data with levelwise");
	int rootData=sc.nextInt();
	if(rootData==-1) {
		return null;
	}
	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
	Queue<BinaryTreeNode<Integer>>pendingChildren=new LinkedList<BinaryTreeNode<Integer>>();
	pendingChildren.add(root);
	while(!pendingChildren.isEmpty()) {
		BinaryTreeNode<Integer> front=pendingChildren.poll();
		System.out.println("Enter left child of"+front.data);
		int left=sc.nextInt();
		if(left!=-1) {
			BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer> (left);
			front.left=leftChild;
			pendingChildren.add(leftChild);
		}
		System.out.println("Enter left child of"+front.data);
		int right=sc.nextInt();
		if(right!=-1) {
			BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer> (right);
			front.right=rightChild;
			pendingChildren.add(rightChild);
		}
	}
	return root;
}
public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int []pre,int []in, int siPre,int eiPre,int siIn,int eiIn){
	if(siPre>eiPre) {
		return null;
	}
	//inoder and preorder
	int rootData=pre[siPre];
	BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
	int rootIndex=-1;
	for(int i=siIn;i<=eiIn;i++) {
		if(in[i]==rootData) {
			rootIndex=i;
			break;
		}
	}
	int siPreLeft=siPre+1;
	int siInLeft=siIn;
	
	int eiInLeft=rootIndex-1;
	
	
	int siInRight=rootIndex+1;
	int eiPreRight=eiPre;
	int eiInRight=eiIn;
	
	int leftSubTreeLenght=eiInLeft-siInLeft+1;
	int eiPreLeft=leftSubTreeLenght-1+siPreLeft;
	int siPreRight=eiPreLeft+1;
	
	BinaryTreeNode<Integer>left=buildTreeFromPreInHelper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
	BinaryTreeNode<Integer>right=buildTreeFromPreInHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
	root.left=left;
	root.right=right;
	return root;
}
public static BinaryTreeNode<Integer> buildTreePreIn(int pre[],int in[]){
	BinaryTreeNode<Integer>root=buildTreeFromPreInHelper(pre,in,0,pre.length-1,0,in.length-1);
	return root;
}

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        BinaryTreeNode<Integer> root= buildTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        return root;
    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int sPre,int ePre,int sIn, int eIn){
        if(sPre>ePre){
            return null;
        }
		int rootData=postOrder[ePre];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        int rootIndex=-1;
        for(int i=0;i<=eIn;i++){
            if(inOrder[i]==postOrder[ePre]) {
                rootIndex = i;
                break;
            }
        }
        int sPreLeft=sPre;
        int sInLeft=sIn;
        int eInLeft=rootIndex-1;
        int sInRight=rootIndex+1;
        int ePreRight=ePre-1;
        int eInRight=eIn;
        int leftSubtreeLength=eInLeft-sInLeft+1;
        int ePreLeft=sPreLeft+leftSubtreeLength-1;
        int sPreRight=ePreLeft+1;
        BinaryTreeNode<Integer> left=buildTree(postOrder,inOrder,sPreLeft,ePreLeft,sInLeft,eInLeft);
        BinaryTreeNode<Integer> right=buildTree(postOrder,inOrder,sPreRight,ePreRight,sInRight,eInRight);
        root.left=left;
        root.right=right;
        return  root;
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null){
			return ;
		}
		Queue<BinaryTreeNode<Integer>>queueData=new LinkedList<BinaryTreeNode<Integer>>();
        queueData.add(root);
		while(!queueData.isEmpty()){
			BinaryTreeNode<Integer> node=queueData.poll();
			System.out.print(node.data+":");
			if(node.left!=null){
				System.out.print("L:"+node.left.data+",");
				queueData.add(node.left);
			}else{
				System.out.print("L:-1,");
			}
			
			if(node.right!=null){
				System.out.print("R:"+node.right.data);
				queueData.add(node.right);
			}else{
				System.out.print("R:-1");
			}
			System.out.println();
			
		}

	}
    public static int minimum(BinaryTreeNode<Integer>root) {
    	 if(root==null) {
    		 return Integer.MAX_VALUE;
    	 }
    	 return Math.min(root.data,Math.min(minimum(root.left), minimum(root.right)));
    	 
    }
    public static int maximum(BinaryTreeNode<Integer>root) {
    	if(root==null) {
    		return Integer.MIN_VALUE;
    	}
    	return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
	public static boolean BstCheck(BinaryTreeNode<Integer>root) {
		 if(root==null) return true;
		 int leftMax=maximum(root.left);
		 if(leftMax>=root.data) {
			 return false;
		 }
		 int rightMax=minimum(root.right);
		 if(rightMax<root.data) {
			 return false;
		 }
		 boolean isLeftBst=BstCheck(root.left);
		 boolean isRightBst=BstCheck(root.right);
		 return isLeftBst && isRightBst;
		 
	}
	public static boolean isBst3(BinaryTreeNode<Integer>root,int minRange,int maxRange) {
		if(root==null) {
			return true;
		}
		if(root.data<minRange || root.data>maxRange) {
			return false;
		}
		boolean isLeftWithRange=isBst3(root.left,minRange,root.data-1);
		boolean isRightWithRange=isBst3(root.right,root.data,maxRange);
		return isLeftWithRange && isRightWithRange;
	}
	public class IsBSTReturn {
		int max;
		int min;
		boolean bool;
		IsBSTReturn(int max,int min ,boolean bool){
			this.max=max;
			this.min=min;
			this.bool=bool;
		}

	}
	public static void printBetweenK1K2(BinaryTreeNode<Integer>root,int k1,int k2) {
		if(root==null) {
			return ;
		}
		if(root.data>k1)
			printBetweenK1K2(root.left,k1,k2);
		else if(root.data<k2)
			printBetweenK1K2(root.right,k1,k2);
		else {
			System.out.print(root.data+" ");
			printBetweenK1K2(root.left,k1,k2);
			printBetweenK1K2(root.right,k1,k2);
		}
			
	}
	public static IsBSTReturn isBST(BinaryTreeNode<Integer>root) {
		          if(root==null) {
		        	  IsBSTReturn ans=new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
		        	  return ans;
		          }
		          IsBSTReturn leftAns=isBST(root.left);
		          IsBSTReturn rightAns=isBST(root.right);
		           int min1=Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		           int max1=Math.max(root.data, Math.max(leftAns.max, leftAns.max));
		           boolean bool=true;
		           if(leftAns.max>=root.data) {
		        	   bool=false;
		           }
		           if(rightAns.min<root.data) {
		        	   bool=false;
		           }
		           if(!rightAns.bool) {
		        	   bool=false;
		           }
		           if(!leftAns.bool) {
		        	   bool=false;
		           }
		           IsBSTReturn ans=new IsBSTReturn(max1,min1,bool);
		           return ans;
	}
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root,int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer>output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer>leftOutput=nodeToRootPath(root.left,x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer>rightOutput=nodeToRootPath(root.right,x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput; 
		}
		return  null;
		
	}
	public static void main(String[] args) {
		int in[]={4,2,5,1,3};
		int pre[]= {1,2,4,5,3};
		//BinaryTreeNode<Integer> root=buildTreePreIn(pre,in);
		BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
		ArrayList<Integer> ans=nodeToRootPath(root,5);
		
			if(ans==null) {
				  System.out.print("not found");
			}else {
				      for(int i:ans) 
			          System.out.print(i+" ");
		            }
		//printTreeDetail(root);
		//printTree(root);
		// TODO Auto-generated method stub
		      /*BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
		        BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(2);
				BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<>(3);
				root.left=rootLeft;
				root.right=rootRight;
				BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<>(4);
				BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<>(5);
				rootLeft.left=twoRight;
				rootLeft.right=threeLeft;
				BinaryTreeNode<Integer> sixLeft=new BinaryTreeNode<>(6);
				BinaryTreeNode<Integer> SevenRight=new BinaryTreeNode<>(7);
				rootRight.left=sixLeft;
				rootRight.right=SevenRight;
				BinaryTreeNode<Integer> eightLeft=new BinaryTreeNode<>(8);
				BinaryTreeNode<Integer> nineRight=new BinaryTreeNode<>(9);
				twoRight.left=eightLeft;
				twoRight.right=nineRight;
				BinaryTreeNode<Integer> tenLeft=new BinaryTreeNode<>(10);
				BinaryTreeNode<Integer> elevenRight=new BinaryTreeNode<>(11);
				threeLeft.left=tenLeft;
				threeLeft.right=elevenRight;
				BinaryTreeNode<Integer> twelveLeft=new BinaryTreeNode<>(12);
				BinaryTreeNode<Integer> thirteenight=new BinaryTreeNode<>(13);
				sixLeft.left=twelveLeft;
				sixLeft.right=thirteenight;
				BinaryTreeNode<Integer> fourteenLeft=new BinaryTreeNode<>(14);
				BinaryTreeNode<Integer> fifteenight=new BinaryTreeNode<>(15);
				SevenRight.left=fourteenLeft;
				SevenRight.right=fifteenight;
				*/
		   //BinaryTreeNode<Integer> root=takeInput();
		  //BinaryTreeNode<Integer>rootBetter=takeInputBetter(true,0,true);
				//printTree(root);
		        //printTree(rootBetter);
				//System.out.println("--------");
				//System.out.println("total number of node is"+numNodes(rootBetter));
				//System.out.println("--------");
//				printTree(root);
//				System.out.println("--------");
//				printTreeDetail(root);
//------------------------------//----------------------------//--------------------
	//	BinaryTreeNode<Integer>rootBetter=takeInputBetter(true,0,true);
		//BinaryTreeNode<Integer>root=takeInputLevelWise();
       // printTreeDetail(root);
       
//		int x=largest(rootBetter);
//		System.out.println("total number of node is="+ x);
//		                 int y=numLeaves(rootBetter);
//		                 System.out.println("total number of leaf node is="+ y);
//		                 printAtDepthK(rootBetter, 2);
//		                 BinaryTreeNode<Integer>newRoot=removeLeaves(rootBetter); 
//		                 printTreeDetail(newRoot);
//		                 //BinaryTreeNode<Integer>newRoot1= isBalaneced(rootBetter);
//		                boolean bol=isBalaneced(rootBetter);
//		                if(bol) {
//		                	System.out.println("it is balencd");
//		                	
//		                }else {
//		                	System.out.println("it is not balenced");
//		                }
//		                System.out.println("it is Balenced="+isBalencedBetter(rootBetter).isBalenced);
//		                System.out.println("--------------------");
//		                BinaryTreeNode<Integer>root=takeInputLevelWise();
//		                printTreeDetail(root);
		               
       	}

	
	
	
}
