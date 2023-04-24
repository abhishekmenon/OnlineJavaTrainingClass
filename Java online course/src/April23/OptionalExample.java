package April23;

import java.util.Optional;

public class OptionalExample {
	// Java program to illustrate
	

	    // Driver code
	    public static void main(String[] args)
	    {

	   	 // creating a string array
	   	 String[] str = new String[5];

	   	 // Setting value for 2nd index
	   	 str[2] = "Geeks Classes are coming soon";
	   	// str[0]=null;

	   	 // It returns an empty instance of Optional class
	   	 Optional<String> empty = Optional.ofNullable(str[0]);
	   	 System.out.println(empty);

	   	  //It returns a non-empty Optional
	   	 Optional<String> value = Optional.of(str[2]);
	   	 System.out.println(value);
	    }
	



}
