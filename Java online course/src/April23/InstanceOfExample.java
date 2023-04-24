package April23;

	import java.io.*;

	// Main class
	public class InstanceOfExample {
	class Plant2 implements Cloneable{
		String name;
		int height;
		int leaves;

		public Plant2(String s, int h, int l) {
	    	name = s;
	    	height = h;
	    	leaves = l;
		}

		public String toString() {
	    	return "Name: " + name + ", Height: " + height + ", Leaves: " + leaves;
		}
	}

	
	    public static void main(String[] args)
	    {
	   	 // Creating object of class inside main()
	   	 InstanceOfExample object = new InstanceOfExample();
	   	 // Returning instanceof
	   	 System.out.println(object.getClass());
	    }
	}




