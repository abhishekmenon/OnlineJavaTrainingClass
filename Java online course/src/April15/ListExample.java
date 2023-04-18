package April15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	
		public static void main(String[] args) {
	    	// Creating list using the ArrayList class
	    	List<Integer> numbers = new ArrayList<>();
	    	List<Integer> number2=new LinkedList<Integer>();
	    	List<Integer> number3=new Vector<Integer>();
	    	List<Integer> number4=new Stack<Integer>();

	    	// Add elements to the list
	    	numbers.add(1);
	    	numbers.add(2);
	    	numbers.add(3);
	    	System.out.println("List: " + numbers);

	    	// Access element from the list
	    	int number = numbers.get(2);
	    	System.out.println("Accessed Element: " + number);

	    	// Remove element from the list
	    	numbers.removeAll(numbers);
	    	System.out.println("updated list:"+numbers);
	    	//System.out.println("Removed Element: " );
		}
	



}
