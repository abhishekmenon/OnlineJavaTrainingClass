package April20;



	// Java program to demonstrate that a Child thread
	// Getting Same Priority as Parent thread
	// Importing all classes from java.lang package
	import java.lang.*;
	// Main class
	// ThreadDemo
	// Extending Thread classa
	public class Priority extends Thread {
	    // Method 1
	    // run() method for the thread that is
	    // invoked as threads are started
	    public void run()
	    {
	   	 // Print statement
	   	 System.out.println("Inside run method");
	    }

	    // Method 2
	    // Main driver method
	    public static void main(String[] args)
	    {
	   	 // main thread priority is set to 6 now
	   	 Thread.currentThread().setPriority(6);

	   	 System.out.println(
	   		 "main thread priority : "
	   		 + Thread.currentThread().getPriority());

	   	 Priority t1 = new Priority();
	   	 t1.setPriority(11);
	   	 t1.start();
	   	 Priority t2=new Priority();
	   	 System.out.println("t2 priority:"+t2.getPriority());
	   	 

	   	 System.out.println("t1 thread priority : "
	   					 + t1.getPriority());
	    }
	}





