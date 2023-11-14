package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEptyException {
		// TODO Auto-generated method stub
		QueueUsingArray queue =new QueueUsingArray(3);
		int arr[]= {1,2,3,4,5,6};
		for(int i:arr) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			System.out.print(queue.dequeue());
		}
//		queue.enqueue(19);
//		System.out.println(queue.size());
//		System.out.println(queue.front());
//		//System.out.println(queue.raer());
//		System.out.println(queue.dequeue());
//		System.out.println("----------");
//		int arr[]= {1,2,3,4};
//		for(int i:arr) {
//			queue.enqueue(i);
//		}
//		while(!queue.isEmpty()) {
//			System.out.println(queue.dequeue());
//		}
//
	}

}
