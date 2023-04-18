package April17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


	class Student5 {

	    // Attributes of student
	    String Name;
	    int Age;

	    // Parameterized constructor
	    public Student5(String Name, Integer Age)
	    {

	   	 // This keyword refers to current instance itself
	   	 this.Name = Name;
	   	 this.Age = Age;
	    }

	    // Getter setter methods
	    public String getName() { return Name; }

	    public void setName(String Name) { this.Name = Name; }

	    public Integer getAge() { return Age; }

	    public void setAge(Integer Age) { this.Age = Age; }

	    // Method
	    // Overriding toString() method
	   
	    public String toString()
	    {
	   	 return "Customer{"
	   		 + "Name=" + Name + ", Age=" + Age + '}';
	    }
	}

	// Class 2
	// Helper class implementing Comparator interface
	class CustomerSortingComparator implements Comparator<Student5> {

	    // Method 1
	    // To compare customers
	    @Override
	    public int compare(Student5 customer1, Student5 customer2)
	    {

	   	 // Comparing customers
	   	 int NameCompare = customer1.getName().compareTo(
	   		 customer2.getName());

	   	 int AgeCompare = customer1.getAge().compareTo(
	   		 customer2.getAge());

	   	 // 2nd level comparison
	   	 return (NameCompare == 0) ? AgeCompare
	   							 : NameCompare;
	    }

	
	}

	// Method 2
	// Main driver method
	public class Main3 {
	    public static void main(String[] args)
	    {

	   	 // Create an empty ArrayList
	   	 // to store Student
	   	 List<Student5> al = new ArrayList<>();

	   	 // Create customer objects
	   	 // using constructor initialization
	   	 Student5 obj1 = new Student5("Ajay", 27);
	   	 Student5 obj2 = new Student5("Sneha", 23);
	   	 Student5 obj3 = new Student5("Simran", 37);
	   	 Student5 obj4 = new Student5("Ajay", 22);
	   	 Student5 obj5 = new Student5("Ajay", 29);
	   	 Student5 obj6 = new Student5("Sneha", 22);

	   	 // Adding customer objects to ArrayList
	   	 // using add() method
	   	 al.add(obj1);
	   	 al.add(obj2);
	   	 al.add(obj3);
	   	 al.add(obj4);
	   	 al.add(obj5);
	   	 al.add(obj6);

	   	 // Iterating using Iterator
	   	 // before Sorting ArrayList
	   	 Iterator<Student5> custIterator = al.iterator();

	   	 // Display message
	   	 System.out.println("Before Sorting:\n");

	   	 // Holds true till there is single element
	   	 // remaining in List
	   	 while (custIterator.hasNext()) {

	   		 // Iterating using next() method
	   		 System.out.println(custIterator.next());
	   	 }

	   	 // Sorting using sort method of Collections class
	   	 Collections.sort(al,new CustomerSortingComparator());

	   	 // Display message only
	   	 System.out.println("\n\nAfter Sorting:\n");

	   	 // Iterating using enhanced for-loop
	   	 // after Sorting ArrayList
	   	 for (Student5 customer : al) {
	   		 System.out.println(customer);
	   	 }
	    }

}
