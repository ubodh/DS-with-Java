package priorityqueue;

import java.util.PriorityQueue;
/*
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
maxHeap.add(3);  // {3}
maxHeap.add(1);  // {3, 1}
maxHeap.add(7);  // {7, 3, 1}
maxHeap.add(2);  // {7, 3, 1, 2}
maxHeap.add(8);  // {8, 7, 1, 2, 3}
maxHeap.add(4);  // {8, 7, 4, 2, 3, 1}
import java.util.*;
public class Solution {
*/
// 	public static ArrayList<Integer> kLargest(int arr[], int k) {
// 		/* Your class should be named Solution
// 		* Don't write main().
// 		* Don't read input, it is passed as function argument.
// 		* Return output and don't print it.
// 		* Taking input and printing output is handled automatically.
// 		*/
// 		  PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

//     // Add first k elements to the min heap
//     for (int i = 0; i < k; i++) {
//         minHeap.add(arr[i]);
//     }

//     // For each remaining element, if it's greater than the smallest element in the heap, remove the smallest element and add the new element
//     for (int i = k; i < arr.length; i++) {
//         if (arr[i] > minHeap.peek()) {
//             minHeap.poll();
//             minHeap.add(arr[i]);
//         }
//     }

//     // Convert the heap to an array and return
//    // int[] result = new int[k];
//   ArrayList<Integer> result=new  ArrayList<Integer> ();
//     for (int i = 0; i < k; i++) {
//         result.add(minHeap.poll());
//     }
//     return result;
// 	}
 
public class InbuildPQ {
	 public static ArrayList<Integer> kLargest(int arr[], int k) {
	        // Create a max heap using PriorityQueue
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	//In the line PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);, (a, b) -> b - a is a lambda expression that defines a comparator function for the PriorityQueue.
	        // Add all elements to the heap
	        for (int i = 0; i < arr.length; i++) {
	            maxHeap.add(arr[i]);
	        }

	        // Remove k largest elements from the heap and add them to ArrayList
	        ArrayList<Integer> result = new ArrayList<>();
	        for (int i = 0; i < k; i++) {
	            result.add(maxHeap.poll());
	        }
	        return result;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,3,7,6,9,10,1,2};
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    // isEmpty()// insert-add// remove-poll(not return exception ony return null
    for(int i:arr) {
    	pq.add(i);
    }
    while(!pq.isEmpty()) {
    	System.out.print(pq.peek()+" ");
    	pq.poll();
    }
	}

}
