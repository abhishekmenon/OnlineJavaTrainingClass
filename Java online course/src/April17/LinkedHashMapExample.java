package April17;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	 public static void main(String a[])
	    {

	   	 // Creating an empty LinkedHashMap
	   	 LinkedHashMap<String, String> lhm
	   		 = new LinkedHashMap<String, String>();

	   	 // Adding entries in Map
	   	 // using put() method
	   	 lhm.put("one", "Abhishek");
	   	 lhm.put("two", "is");
	   	 lhm.put("four", "Coding1");
	   	lhm.put("three", "Coding2");
	   	lhm.put("five", "Coding4");
	   	lhm.put("ten", "Coding5");

	   	 // Printing all entries inside Map
	   	 System.out.println(lhm);

	   	 // Note: It prints the elements in same order
	   	 // as they were inserted

	   	 // Getting and printing value for a specific key
	   	 System.out.println("Getting value for key 'one': "
	   					 + lhm.get("one"));

	   	 // Getting size of Map using size() method
	   	 System.out.println("Size of the map: "
	   					 + lhm.size());

	   	 // Checking whether Map is empty or not
	   	 System.out.println("Is map empty? "
	   					 + lhm.isEmpty());

	   	 // Using containsKey() method to check for a key
	   	 System.out.println("Contains key 'two'? "
	   					 + lhm.containsKey("two"));

	   	 // Using containsKey() method to check for a value
	   	 System.out.println(
	   		 "Contains value "
	   		 + "Abhishek? "
	   		 + lhm.containsValue("Abhishek"));

	   	 // Removing entry using remove() method
	   	 System.out.println("delete element 'one': "
	   					 + lhm.remove("three"));

	   	 // Printing mappings to the console
	   	 System.out.println("Mappings of LinkedHashMap : "
	   					 + lhm);
	    }


}
