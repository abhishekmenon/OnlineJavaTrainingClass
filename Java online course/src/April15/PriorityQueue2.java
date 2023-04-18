package April15;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(15);
        numbers.add(14);
        numbers.add(13);
        numbers.add(16);
        numbers.add(9);
      
        
        while(!numbers.isEmpty()) {
        	System.out.println("PriorityQueue: " + numbers.poll());
        }
	}

}
