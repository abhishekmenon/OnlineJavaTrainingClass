package April14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable1 {

	      // create a list
		public static void main(String[] args)
	    {
	        List<String> list = new ArrayList<>();
	  
	        list.add("Welome");
	        list.add("to the");
	        list.add("Class");
	  
	        Iterator<String> iterator = list.iterator();
	  
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	    }



}
