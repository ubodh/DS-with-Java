package linked_List;

import java.util.Scanner;
class DoubleNode{
	Node<Integer>head;
	Node<Integer>tail;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer>head,Node<Integer>tail){
		this.head=head;
		this.tail=tail;
	}
}

public class LinkedList {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		Node<Integer> n3=new Node<Integer>(30);
		Node<Integer> n4=new Node<Integer>(40);
		n1.next=n2;
		// System.out.println("n1"+n1+"data"+n1.data+"next"+n1.next);
		n2.next=n3;
		 //System.out.println("n1"+n2+"data"+n2.data+"next"+n2.next);
		n3.next=n4;
		 //System.out.println("n1"+n3+"data"+n3.data+"next"+n3.next);
		 //System.out.println("n1"+n4+"data"+n4.data+"next"+n4.next);
		return n1;
	}
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}

	public static void print(Node<Integer>head) {
		Node<Integer> temp=head;
		System.out.println(head.data);
		System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
		//Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		while(head!=null) {//here is head null so this loop is nothing print
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
//	System.out.println();
	public static void print1(Node<Integer>head) {
		System.out.println("----------");
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static Node<Integer> takeInput(){
		Scanner sc =new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		
		while(data!=-1) {
			 Node<Integer> currentNode =new Node<Integer>(data);
			 if(head==null) {
				 head=currentNode;
			 }else {
				 Node<Integer> tail=head;
				 while(tail.next!=null) {
			 tail=tail.next;
				 }
				 //Now tail will refer to last node
				 // Connect current node after last node
				 tail.next=currentNode;
					 }
			data=sc.nextInt();
		}
		/*
		 * this method insert of data is o(n^2);
		 */
		return head;
	}
	public static Node<Integer> takeInput11(){
		Scanner sc =new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,curr=null;
		while(data!=-1) {
			Node<Integer> currentNode =new Node<Integer>(data);
			 if(head==null) {
				 head=currentNode;
				 curr=currentNode;
			 }
			 else
			 {
				 curr.next=currentNode;
				 curr=currentNode;
			 }
		data=sc.nextInt();
	}
		/*
		 * this is method in insert of data is o(n);
		 */
	return head;
}
	public static Node<Integer> insertAtPositon(Node<Integer>head,int pos,int data){
		int ct=1;
		Node<Integer> temp=head,curr=null;
		Node<Integer> currentNode =new Node<Integer>(data);
		if(pos==0) {
			curr=head;
			head=currentNode;
			currentNode.next=curr;
		}

	while(temp!=null) {
		if(ct==pos) {
			curr=temp.next;
			temp.next=null;
			temp.next=currentNode;
			currentNode.next=curr;
		}
		ct++;
		temp=temp.next;
	}
	return head;
	}
		
	public static Node<Integer> deliteAtPositon(Node<Integer>head,int pos){
		Node<Integer>curr=head,temp=null;
		 if(pos==0) {
			 curr=curr.next;
			 return curr;
		 }
		 
		 int ct=1;
		 while(curr!=null) {
			 if(ct==pos) {
				 curr.next=curr.next.next;
			 }
			 ct++;
			 curr=curr.next;
		 }
		 return head;
		
	}
	public static Node<Integer> deliteAtPositonRecursion1(Node<Integer>head,int pos){
		if(pos==0) {
			head=head.next;
			return head;
		}
		Node<Integer>smallNode=deliteAtPositonRecursion1(head.next,pos-1);
		//smallNode.next=null;
		head.next=smallNode;
		return head;
	}
	public static void printReverse(Node<Integer>head) {
		if(head==null) return ;
	  	printReverse(head.next);
	  	System.out.print(head.data+" ");
	}
	public static void printRecursion(Node<Integer>head) {
		if(head==null) return ;
		System.out.print(head.data+" ");
	  	printReverse(head.next);
	}
	public static Node<Integer> insertRecursiveAtPostion(Node<Integer>head,int pos,int va) {
		 if(head==null && pos>0) {
			 return head;
		 }
		if(pos==0) {
			Node<Integer>temp=new Node<>(va);
			temp.next=head;
			head=temp;
			return head;
		}
		Node<Integer>smallNode=insertRecursiveAtPostion(head.next,pos-1,va);
		head.next=smallNode;
		//head=smallNode;
		return head;
//		Node<Integer>small=insertRecursiveAtPostion(head.next,pos-1,va);
//		head.next=small;
		//head.next=insertRecursiveAtPostion(head.next,pos-1,va);
		//return head;
	}
	public static Node<Integer> reverseRecursion(Node<Integer>head){
		if(head==null ||head.next==null) {
			return head;
		}
		Node<Integer>smallNode=reverseRecursion(head.next);
		Node<Integer>tail=smallNode;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		return smallNode;
	}
	public static Node<Integer> reverseRecursive(Node<Integer>head){
		if(head.next==null || head==null) {
			return head;
			
		}
		Node<Integer>temp=reverseRecursive(head.next);// T(n)=T(n-1)+(n-1);=(n^2);
		 Node<Integer>tail=temp;
		 while(tail.next!=null) {
			 tail=tail.next;
		 }
		tail.next=head;
		head.next=null;
		return temp;
	}
	public static DoubleNode reverseRBetter(Node<Integer>head) {
		DoubleNode ans;
		if(head==null ||head.next==null) {
			ans=new DoubleNode(head,head);
			//ans.head=head;
			//ans.tail=head;
			return ans;
		}
		DoubleNode  temp= reverseRBetter(head.next);
	    temp.tail.next=head;
	    head.next=null;
	    ans=new DoubleNode();
	    ans.head=temp.head;
	    ans.tail=head;
	    return ans;
	}
	 public static Node<Integer> reverseRBetter1(Node<Integer>head){
		 DoubleNode ans=  reverseRBetter(head);
		 return ans.head;
				
	 }
	 public static Node<Integer> reverseBetter1(Node<Integer>head){
		 if(head==null || head.next==null) {
			 return head;
		 }
		 Node<Integer> smallNode=reverseBetter1(head.next);
		 Node<Integer> tail=head.next;
		 tail.next=head;
		 head.next=null;
		 return smallNode;
		 
	 }
	 public static void solveLove(Node<Integer>head,Node<Integer>curr,Node<Integer>prev) {
		 if(curr==null) {
			 head=curr;
			 return ;
		 }
		 Node<Integer> forw=curr.next;
		 solveLove(head,forw,curr);
		 curr.next=prev;
	 }
	 public static Node<Integer> reveseLove(Node<Integer>head){
		 Node<Integer>curr=head;
		 Node<Integer>prev=null;
				 solveLove(head,curr,prev);
		return head;
	 }
	 public static Node<Integer> reveseLove1(Node<Integer>head){
		     if(head==null ||head.next==null) {
		    	 return head;
		     }
		     Node<Integer> smallHead=reveseLove1(head.next);
		     head.next.next=head;
		     head.next=null;
		    return smallHead;
	 }

	 public static Node<Integer> middleElement(Node<Integer>head){
		 Node<Integer>slow=head,fast=head;
		 while(fast!=null && fast.next!=null && fast.next.next!=null) {
			 slow=fast.next;
			 fast=fast.next.next;
		 }
		 return slow;
	 }
	 public static Node<Integer> mergeTwosortedLL(Node<Integer>head1,Node<Integer>head2){
		 if(head1==null) return head2;
	        if(head2==null) return head1;
	        Node<Integer> p1=head1;//1 2 3 4 -1
	        Node<Integer> p2=head2;//3 4 6 7 8 -1
	        Node<Integer>head=null;
	        Node<Integer> cur=null;
	        while(p1!=null && p2!=null){
	            if(head==null){
	                if(p1.data<=p2.data){
	                    head=cur=p1;
	                    p1=p1.next;
	                }else{
	                    head=cur=p2;
	                    p2=p2.next;
	                }
	            }else{
	                if(p1.data<=p2.data){
	                    cur.next=p1;
	                    cur=p1;
	                    p1=p1.next;
	                }else{
	                    cur.next=p2;
	                    cur=p2;
	                    p2=p2.next;
	                }
	            }
	        }
	        if(p1!=null) cur.next=p1;
	        if(p2!=null) cur.next=p2;
	        return head;
	 }
	 public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
	        //Your code goes here
		 if(head1==null) return head2;
	        if(head2==null) return head1;
	          Node<Integer>temp=new Node<Integer>(-1);
	          Node<Integer>cur=temp;
	        while (head1 != null && head2 != null) {
	            if (head1.data <= head2.data) {
	                cur.next = head1;
	                head1 = head1.next;
	            } else {
	                cur.next = head2;
	                head2 = head2.next;
	            }
	            cur = cur.next;
	        }

	        cur.next = head1 == null ? head2 : head1;
	        return temp.next;
	    }
	 public  static Node<Integer>  mergeTwoLists(Node<Integer> list1, Node<Integer>  list2) {
		    if(list1==null) return list2;
	        if(list2==null) return list1;
	        
	        if(list1!=null && list2!=null){
	        	
	        if(list1.data<list2.data){
	            list1.next=mergeTwoLists(list1.next,list2);
	            return list1;
	            }
	            else{
	                list2.next=mergeTwoLists(list1,list2.next);
	                return list2;
	        }
	        }
	        if(list1==null)
	            return list2;// cur.next = head1 == null ? head2 : head1;
	        return list1;
	    }
	 public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
			//Your code goes here
	        if(head==null) return head;
	        if(M==0) return null;
	        if(N==0) return head;
	         Node<Integer> curr =head,t;
	        int count;
	        while(curr!=null){
	            
	        for (count = 1; count < M && curr != null; count++) 
	            curr = curr.next; 
	             
	        if (curr == null) 
	            return head; 
	  
	            t = curr.next; 
	               
	              for(count = 1 ; count<=N && t!= null ; count++){
	                  t = t.next;
	              }
	              curr.next = t;
	              curr =t;
	        }
	        return head;
		}
	 public static Node<Integer> kReverse(Node<Integer> head, int k) {
		 if(head==null || k==0){
	            return head;
	        }
	        int count=0;
	        Node<Integer> curr=head;
			Node<Integer> prev=null;
			Node<Integer> nex=null;
			while(count <k && curr!=null) {
				nex=curr.next;
				curr.next=prev;
				prev=curr;
				curr=nex;
	            count++;
			}
	        // change 2 linking it properly
	        if(nex!=null){
	            head.next=kReverse(nex,k);
	        }
			return prev;
	 }
	 
	 public static Node<Integer> merge(Node<Integer>head1,Node<Integer>head2){
		  if(head1==null) return head2;
		  if(head2==null) return head1;
		  Node<Integer>t1=head1,t2=head2;
		  Node<Integer>head=null,tail=null;
		  if(t1.data<=t2.data) {
			  head=t1;
			  tail=t1;
			  t1=t1.next;
		  }else {
			  head=t2;
			  tail=t2;
			  t2=t2.next;
		  }
		  while(t1!=null && t2!=null) {   
			  if(t1.data<=t2.data) {   //t1= 1 3 4 5
				 tail.next=t1;         // t2=1 2 5 7 8
				 tail=t1;
				 t1=t1.next;
			  }else {
				  tail.next=t2;
				  tail=t2;
				  t2=t2.next;
			  }
		  }
		  tail.next=(t1==null)?t2:t1;
//		  if(t1!=null) {
//			  tail.next=t1;
//		  }else {
//			  tail.next=t2;
//		  }
		  return head;
	 }
	 public static Node<Integer> EvenAfterOdd(Node<Integer>head){
		 Node<Integer> evenHead=new Node<Integer>(-1);
		 Node<Integer> oddHead=new Node<Integer>(-1);
		 Node<Integer> tempe=evenHead;
		 Node<Integer> tempo=oddHead;
		 while(head!=null) {
			 if(head.data%2==0) {
				 tempe.next=head;
				 tempe=head;
				 head=head.next;
				 tempe.next=null;
			 }else
			 {
				 tempo.next=head;
				 tempo=head;
				 head=head.next;
				 tempo.next=null;
			 }
		 }
		 tempe.next=oddHead.next;
		 return evenHead.next; 
	 }
	 public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
			//Your code goes heret
	        int ct=0;
	        Node<Integer> temp=head;
	        Node<Integer>slow=null,fast=null,prev=null;
	        while(temp!=null){
	            if(ct==i-1){
	                prev=temp;
	            }
	            if(ct==i){
	                slow=temp;
	            }
	            if(ct==j){
	                fast=temp;
	                break;
	            }
	            ct++;
	            temp=temp.next;
	        }
	        slow.next=fast.next;
	        prev.next=fast;
	        fast.next=slow;
	        return head;
		}
 
	 public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
			//Your code goes here
		 if(head==null) return head;
	        if(M==0) return null;
	        if(N==0) return head;
	        Node<Integer>temp=head,t=null,temp1=null;
	        int ct=1;
	        while(temp!=null){
	            if(ct==M){
	                t=temp;
	            }
	            int k=1;
	            while(temp!=null && ct==2 ){
	                if(k==N){
	                    t.next=temp;
	                    ct=1;
	                    break;
	                }
	                k++;
	                temp=temp.next.next;
	            }
	               ct++;
	               
	              if(temp!=null){
	                temp=temp.next;
	              }
	            else 
	            {
	            return  head;
	              }
	        }
	        return head;
		}
//public static Node<In>
	public static void main(String[] args) {
		Node<Integer> temp1= takeInput();
		Node<Integer> ans= skipMdeleteN(temp1,2,3);
		print(ans);
		//Node<Integer>loveR=reveseLove1(temp1);
		//print(loveR);
//		Node<Integer>loveR=reveseLove(temp1);
//		print(loveR);
		//Node<Integer>newH=swapNodes(temp1,1,2);
		//print(newH);
		//Node<Integer>temp11=EvenAfterOdd(temp1);
		//print(temp11);
		//Node<Integer> temp2= takeInput();
		//Node<Integer>newNode=merge(temp1,temp2);
		//print(newNode);
		//Node<Integer>newNode=mergeTwoLists(temp1,temp2);
	  //  print(newNode);
		//Node<Integer>newNode=mergeTwoSortedLinkedLists(temp1,temp2);
		//print(newNode);
		//Node<Integer>newNode=mergeTwosortedLL(temp1,temp2);
		//print(newNode);
		//Node<Integer>newNode=middleElement(temp1);
		//System.out.println(newNode.data);
		//Node<Integer>newNode=reverseBetter1(temp1);
		//print(newNode);
		//DoubleNode ans=reverseRBetter(temp1);
		//Node<Integer>ans1=reverseRBetter1(temp1);
		//print(ans1);
		//print(ans.head); 
		//Node<Integer> newNode=reverseRecursive(temp1);
		//print(newNode);
		//Node<Integer>deliteNode=deliteAtPositonRecursion1(temp1, 2);
		//print(deliteNode);
	//Node<Integer>new_node=	reverseRecursion(temp1);
//	print(new_node);
//	Node<Integer>temp=insertRecursiveAtPostion(temp1,3,20);
//	print(temp);
//		pintRecursion(temp1);
//		System.out.println("----------");
//		printReverse(temp1);
		// Node<Integer>temp11= deliteAtPositon(temp1,0);
		 //print1(temp11);
//		Node<Integer> temp= takeInput();
//		print1(temp);
		//Node<Integer> temp1= takeInput();
		//print1(temp1);
		//Node<Integer> temp11=insertAtPositon(temp1,0,200);
		//print1(temp11);
		// TODO Auto-generated method stub
	//Node n1=new Node(10.11);
//		Node<Integer>head=createLinkedList();//genric
//		print(head);
//		increment(head);
//		print1(head);
		//print(head.next);
		//print(head.next.next);
//		Node<Integer> n2=new Node<>(10);
//	    System.out.println(n1.data);
//	    System.out.println(n1.next);
	
	

	}

}
