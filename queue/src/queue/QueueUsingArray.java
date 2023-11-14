package queue;

public class QueueUsingArray {
 private int data[];
 private int front;//index of element at the front of the queue
 private int rear;//index of element at the front of the queue
 private int size;
 public QueueUsingArray() {
	 data=new int[5];
	 front =-1;
	 rear=-1;
 }
 public QueueUsingArray(int capacity) {
	 data=new int[capacity];
	 front =-1;
	 rear=-1;
 }
 public int size() {
	 return size;
 }
 public boolean isEmpty() {
	 return size==0;
 }
 private void doubleCapacity() {
	 int temp[]=data;
	 int index=0;
	 data=new int[2*temp.length];
	 for(int i=front;i<temp.length;i++) {
		 data[index++]=temp[i];
	 }
	 for(int j=0;j<front-1;j++) {
		 data[index++]=temp[j];
	 }
	 front =0;
	 rear=temp.length-1;
 }
 public void enqueue(int elem)// throws QueueFullException
 {
	 if(size==data.length) {
		// throw new QueueFullException();
		 doubleCapacity();
	 }
	 if(size==0)
	 {
		 front=0;
	 }
//	 rear++;
//	 if(rear==data.length) {
//		 rear=0;
//		
//	 }
	 rear=(rear+1)%data.length;
	 data[rear]=elem;
	 rear++;
	
	
 }
 public int front() throws QueueEptyException {
	 if(size==0) {
		 throw new QueueEptyException();
	 }
 return data[front];	 
 }
// public int rear() {
//	 
// }
 
 public int dequeue() throws QueueEptyException {
	 if(size==0) {
		 throw new QueueEptyException();
	 }
	 int temp=data[front];
//	 front++;
//	 if(front==data.length) {
//		 front=0;
//	 }
	 front=(front+1)%data.length;
	 rear=size-1;
	 if(size==0) {
		 front =-1;
		 rear=-1;
	 }
	 return temp;
	 
 }
	
	}

