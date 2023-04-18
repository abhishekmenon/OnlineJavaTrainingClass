package April17;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
public class HashTableExample {
	
	public static Hashtable<String, Integer> fun1(String key1,int value) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
	   	 // Adding elements to the hashtable
	   	 hashtable.put(key1,value);
	   	 
	   	 Enumeration<String> keys = hashtable.keys();
	   	 while (keys.hasMoreElements()) {
	   		 String key = keys.nextElement();
	   		 System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
	   	 }

	   	 return hashtable;
	   	 
	}
    public static void main(String[] args) {
   	 Hashtable<String, Integer> hashtable = new Hashtable<>();
   	 // Adding elements to the hashtable
   	 
   	 for(int i=0;i<4;i++) {
   		 String userInputString="A";
   		 int value=1;
	   	 hashtable=fun1(userInputString,value);
	
   	 }
   	
   	 
   	 
   	 // Getting values from the hashtable
   	 int valueA = hashtable.get("A");
   	 System.out.println("Value of A: " + valueA);
   	 // Removing elements from the hashtable
   	 hashtable.remove("B");
   	 // Enumerating the elements of the hashtable
   	 
   	    }
}


