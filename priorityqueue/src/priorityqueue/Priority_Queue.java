package priorityqueue;
import java.util.ArrayList;

//import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Priority_Queue<T>{
	
private ArrayList<Element<T>>heap;

public Priority_Queue() {
	heap=new ArrayList<>();
}
public void insert(T value,int priority) {
	Element<T> e =new Element<>(value, priority);
	heap.add(e);
	
	int childIndex=heap.size()-1;
	int prentIndex=(childIndex-1)/2;
	
	while(childIndex>0) {
		
	if(heap.get(childIndex).priority < heap.get(prentIndex).priority) {
		Element<T> temp=heap.get(childIndex);
		heap.set(childIndex, heap.get(prentIndex));
		
		heap.set(prentIndex, temp);
		prentIndex=(childIndex-1)/2;
	   }else {
		   return ;
	   }
	}	
	
}
public T getMin()throws PriorityException{
 if(isEmpty()) {
	 throw new PriorityException();
 }
 return heap.get(0).value;
}
public T removeMin() throws PriorityException{
	
	 if(isEmpty()) {
		 throw new PriorityException();
	 }
	 Element<T> removed=heap.get(0);
	 T ans=removed.value;
	 heap.set(0, heap.get(heap.size()-1));
	 heap.remove(heap.size()-1);
	 
	 int prentIndex=0;
	 int leftChildIndex=2*prentIndex+1;
	 int rightChildIndex=2*prentIndex+2;
	
	 while(leftChildIndex<heap.size()) {
		 int minIndex=prentIndex;
	 if(heap.get(leftChildIndex).priority <heap.get(minIndex).priority) {
		 minIndex=leftChildIndex;
		 
	 }
	 if(rightChildIndex<heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
		 minIndex=rightChildIndex;
	 }
	 if( minIndex == prentIndex ) {
		 break;
	 }
	 Element<T> temp=heap.get(minIndex);
	 heap.set(minIndex, heap.get(prentIndex));
	 heap.set(prentIndex, temp);
	 leftChildIndex= 2*prentIndex+1;
	 rightChildIndex=2*prentIndex+2;
	 }
	 return ans;
}
private int  size() {
	// TODO Auto-generated method stub
       return heap.size();  
}
boolean isEmpty() {
	// TODO Auto-generated method stub
 if(size()==0) {
	 return true;
 }
 return false;
}

}
