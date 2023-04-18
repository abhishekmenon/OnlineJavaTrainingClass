package April15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmple {

	public static void main(String[] args) {
	    	// Create an ArrayList with 5 values
	    	List<Integer> arrayList = new ArrayList<>();
	    	arrayList.add(10);
	    	arrayList.add(20);
	    	arrayList.add(30);
	    	arrayList.add(40);
	    	arrayList.add(50);

	    	// indexOf(Object o) - Find the index of an element in the ArrayList
	    	int index = arrayList.indexOf(30);
	    	System.out.println("Index of 30: " + index);

	    	// isEmpty() - Check if the ArrayList is empty
	    	boolean isEmpty = arrayList.isEmpty();
	    	System.out.println("Is ArrayList empty? " + isEmpty);

	    	// remove(Object ) - Remove an element from the ArrayList
	    	boolean removed = arrayList.remove(Integer.valueOf(40));
	    	System.out.println("Removed 40? " + removed);

	    	// addAll(Collection c) - Add all elements from a collection to the ArrayList
	    	ArrayList<Integer> collection = new ArrayList<>();
	    	collection.add(60);
	    	collection.add(70);
	    	collection.add(80);
	    	boolean addedAll = arrayList.addAll(collection);
	    	System.out.println("Added all? " + addedAll);

	    	// add(int index, Element e) - Add an element at a specific index in the ArrayList
	    	arrayList.add(2, 25);
	    	System.out.println("ArrayList after adding 25 at index 2: " + arrayList);

	    	// add(Element e) - Add an element to the end of the ArrayList
	    	arrayList.add(90);
	    	System.out.println("ArrayList after adding 90: " + arrayList);

	    	// size() - Get the size of the ArrayList
	    	int size = arrayList.size();
	    	System.out.println("Size of ArrayList: " + size);
			for (int i = 0; i < arrayList.size(); i++)
			            System.out.print(arrayList.get(i) + " ");
		
			}


}




