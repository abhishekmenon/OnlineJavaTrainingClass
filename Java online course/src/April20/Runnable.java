package April20;


	public class Runnable {
		public void createRunnableThread() {
	    	// Create a new thread
	    	Thread thread = new Thread(() -> {});
	    	// Start the thread (this will transition it to the "RUNNABLE" state)
	    	thread.start();
	    	// Print the thread's state (should be "RUNNABLE" at this point)
	    	System.out.println("Thread state: " + thread.getState());
		}
	
	// Create a new instance of ThreadState
		
		public static void main(String[] args) {
			Runnable threadState = new Runnable();
			// Call the createRunnableThread() method to create a new thread, start it, and print its state
			threadState.createRunnableThread();
		}
		


}
