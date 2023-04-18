package April17;

import java.util.LinkedHashMap;

public class LHMExample3 {

		public static void main(String[] args) {

	    	LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
	    	numbers.put("One", 1);
	    	numbers.put("Two", 2);
	    	numbers.put("Three", 3);
	    	numbers.put("Five",55);
	    	System.out.println("LinkedHashMap: " + numbers);

	    	// Using get()
	    	int value1 = numbers.get("Three");
	    	System.out.println("Returned Number: " + value1);

	    	// Using getOrDefault()
	    	int value2 = numbers.getOrDefault("Five", 5);
	    	System.out.println("Returned Number: " + value2);
		}


}
