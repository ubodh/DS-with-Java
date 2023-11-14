package HasMpaFandamental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class InbuiltMapUse {

public static int[] findKLargest(int[] arr, int k) {
    // Create a min heap using PriorityQueue with capacity k
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

    // Add first k elements to the min heap
    for (int i = 0; i < k; i++) {
        minHeap.add(arr[i]);
    }

    // For each remaining element, if it's greater than the smallest element in the heap, remove the smallest element and add the new element
    for (int i = k; i < arr.length; i++) {
        if (arr[i] > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(arr[i]);
        }
    }

    // Convert the heap to an array and return
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = minHeap.poll();
    }
    return result;
}
	 public static ArrayList<Integer> kLargest(int arr[], int k) {
	        // Create a max heap using PriorityQueue
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	       // PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	      /* maxHeap.add(3);  // {3}
	        maxHeap.add(1);  // {3, 1}
	        maxHeap.add(7);  // {7, 3, 1}
	        maxHeap.add(2);  // {7, 3, 1, 2}
	        maxHeap.add(8);  // {8, 7, 1, 2, 3}
	        maxHeap.add(4);  // {8, 7, 4, 2, 3, 1}
	        */
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,Integer>map=new HashMap<>();
		//insert
		map.put("abc", 1);
		map.put("def", 3);
		// size
		map.put("abc", 4);
		System.out.println(map.size());;
		
		// presence
	if(map.containsKey("abc")) {
			System.out.println("map has abc");;
		}
		if(map.containsKey("abc1")) {
			System.out.print("map has abc1");
		}
		// get value
		int v=map.get("abc");
		System.out.println(v);
		
		int v1=0;
		if(map.containsKey("abc1")) {
			v1=map.get("abc1");
		}
		System.out.println(v1);
		//remove
		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.print("map has abc");
			
		}
		System.out.println(" ----------//--------");
       Set<String>ans=map.keySet();
       for(String s:ans) {
    	   System.out.print(s+" ");
       }

	}

}
