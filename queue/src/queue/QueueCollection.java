package queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Queue<Integer>queue=new LinkedList<Integer>();
               queue.add(10);
               queue.add(20);
               queue.add(121);
               queue.add(300);
               queue.add(343);
               System.out.println("size is="+queue.size());
               System.out.println("fornt element ="+queue.size());
               System.out.println("dequeue  is ="+queue.poll());
               System.out.println("head is ="+queue.peek());
               System.out.println("remove is head="+queue.remove());
               Iterator iterator = queue.iterator();
               
               while (iterator.hasNext()) {
                   System.out.print(iterator.next() + " ");
               }
               
               //--------------------------------------------//---------------------
               Queue<String> pq = new PriorityQueue<>();
               pq.add("Geeks");
               pq.add("For");
               pq.add("Geeks");
               //out put is For Geeks Geeks
         
               Iterator iterator1 = pq.iterator();
         
               while (iterator1.hasNext()) {
                   System.out.print(iterator1.next() + " ");
               }
               
               Queue<Integer> pQueue
               = new PriorityQueue<Integer>();
     
           // Adding items to the pQueue
           // using add()
           pQueue.add(10);
           pQueue.add(20);
           pQueue.add(15);
     
           /*
            * 10
              10
               15
            */
           // Printing the top element of
           // the PriorityQueue
           System.out.println(pQueue.peek());
     
           // Printing the top element and removing it
           // from the PriorityQueue container
           System.out.println(pQueue.poll());
     
           // Printing the top element again
           System.out.println(pQueue.peek());
           
           
           
           //------------------------------------//---------------
        // Creating empty LinkedList
           Queue<Integer> ll
               = new LinkedList<Integer>();
     
           // Adding items to the ll
           // using add()
           ll.add(10);
           ll.add(20);
           ll.add(15);
     
           // Printing the top element of
           // the LinkedList
           System.out.println(ll.peek());
     
           // Printing the top element and removing it
           // from the LinkedList container
           System.out.println(ll.poll());
           /*10
           10 output
           20*/
     
           // Printing the top element again
           System.out.println(ll.peek());
           
           
           
           // ------------------/-----------------
           Queue<String> pq1 = new PriorityQueue<>();
           
           pq1.add("Geeks");
           pq1.add("For");
           pq1.add("Geeks");
     
           System.out.println("Initial Queue " + pq1);
     
           pq1.remove("Geeks");
     
           System.out.println("After Remove " + pq1);
     
           System.out.println("Poll Method " + pq1.poll());
     
           System.out.println("Final Queue " + pq1);
           /*
            *                  Initial Queue [For, Geeks, Geeks]
                               After Remove [For, Geeks]
                               Poll Method For
                                Final Queue [Geeks]
            */
           
           }
               
	}


