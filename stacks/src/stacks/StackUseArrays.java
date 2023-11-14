package stacks;
public class StackUseArrays {
 private int data[];
 private int topIndex;
  public StackUseArrays() {
	  data=new int[2];
	  topIndex=-1;
	  
	}
  public StackUseArrays(int size) {
	  data =new int [size];
	  topIndex=-1;
  }
  public int size() {
	  return  topIndex+1;
	  
  }
  public boolean isEmpty() {
	  if(topIndex==-1) 
		  return true;
	  else
		 return false;
	  //return  topIndex==-1;
  }
  public void push(int elm) {
	  // if stack is full
	//  Object StackFullException;
	if(topIndex+1==data.length) {
//		  StackFullException Exception e = new StackFullException();
//	  throw e;
		//throw new StackFullException();
	  // topIndex++;
		 doubleCapacity();
	}
	  
	   data[++topIndex]=elm;
  }
  private void doubleCapacity() {
	// TODO Auto-generated method stub
	  int temp[] = data;
	  data=new int [2*temp.length];
	  for(int i=0;i<data.length;i++) {
		  data[i]=temp[i];
	  }
  }
	  
	
public int top() throws StackEmptyException {
	  if(topIndex==-1) 
		  // Throw StackEmptyException
		  //StackEmptyException ee=new StackEmptyException();
	  //throw ee;
		  throw new StackEmptyException();
	  
	      return data[topIndex];
  }
  public int pop() throws  StackEmptyException {
	    if(topIndex==-1)
	     throw	new StackEmptyException();
	  //data[topIndex-1]=data[topIndex];
	  //topIndex--;
	 
	  return data[--topIndex];
	  
  }
  

}
