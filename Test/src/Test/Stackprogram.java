package Test;


    //Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }


 class Stack {

    //Define the data members
private Node head;
private int size;

    public Stack() {
        //Implement the Constructor
        head=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newHead=new Node(element);
        newHead.next=head;
        head=newHead;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(head==null){
            return -1;
        }
       int temp=head.data;
		head=head.next;
		size--;
		return temp;
		
        
    }

    public int top() {
       if(size==0|| head==null)
		{
			return  -1;
		}
        return head.data;
    }
}
public class Stackprogram {
	public static void main(String args[]) {
		Stack stk=new Stack();
		int arr[]= {1,2,3,4,5,6};
		for(int i:arr) {
			stk.push(i);
		}
		while(!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
	}
}
