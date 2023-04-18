package April15;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(10);
	   	 
	   	 // Add elements to the queue
		
//			2
//		3  		4
//	5
	   	 pq.add(3);
	   	 pq.add(1);
	   	 pq.add(2);
	   	 pq.add(5);
	   	 pq.add(4);
	   	 
	   	 // Print the queue
	   	 System.out.println("Priority queue: " + pq);
	   	 
	   	 // Peek at the top element of the queue
	   	 System.out.println("Peek: " + pq.peek());
	   	 
	   	 // Remove the top element of the queue
	   	 pq.poll();
	   	 
	   	 // Print the queue again
	   	 System.out.println("Priority queue after removing top element: " + pq);
	   	 
	   	 // Check if the queue contains a specific element
	   	 System.out.println("Does the queue contain 3? " + pq.contains(3));
	   	 
	   	 // Get the size of the queue
	   	 System.out.println("Size of queue: " + pq.size());
	   	 
	   	 // Remove all elements from the queue
	   	 pq.clear();
	   	 
	   	 // Check if the queue is empty
	   	 System.out.println("Is the queue empty? " + pq.isEmpty());


	}

}