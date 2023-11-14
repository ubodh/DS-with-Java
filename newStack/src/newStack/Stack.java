package newStack;

/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/
 public class Node<T>{
public  Node<T>head;
public   T data;
   public Node(T data){
       this.head=data;
        head=null;
    }

}

public class Stack<T> {
    //Define the data members
     Node<T>head;
    	int size;
   
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
        Node<T> newHead=new Node<T> (element);
        newHead.next=head;
        head=newHead;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(size==0){
            return null;
        }
        return head=head.next;
        size--;
    }

    public int top() {
        //Implement the top() function
        if(head==null){
            return null;
        }
        return head.data;
    }
}