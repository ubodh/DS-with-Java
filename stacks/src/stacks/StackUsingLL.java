package stacks;

 class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
		this.next=null;
	}
}
public class StackUsingLL{
	private Node1 head;
    private	int size;
    public StackUsingLL() {
    	head=null;
    	size=0;
    }
	public int size(){
		return size;
	 	
	}
	public boolean isEmpty() {
		  return size==0;
	}
	public void push(int elm) {
		Node1 newNode=new Node1(elm);
		newNode.next=head;
		head=newNode;
		size++;
	}
	public int  top() throws StackEmptyException {
		if(size==0|| head==null)
		{
			throw new StackEmptyException();
		}
		return head.data;
		
	}
	public int pop() throws StackEmptyException{
		if(head==null) {
		 throw	new StackEmptyException();
		}
		int temp=head.data;
		head=head.next;
		size--;
		return temp;
		
	}
}

