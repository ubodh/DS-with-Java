package priorityqueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws PriorityException {
		// TODO Auto-generated method stub
Priority_Queue<String> pq =new Priority_Queue<>();
pq.insert("abc", 15);
pq.insert("def", 13);
pq.insert("fsas", 90);
pq.insert("fsatsafa", 150);
pq.insert("xxxvszde", 120);
System.out.println(pq);

 while(!pq.isEmpty()) {
	 System.out.println(pq.getMin());
	 pq.removeMin();
 }
	}

}
