package April20;



	class NewState {
		public void createNewThread() {
	    	// Create a new thread
	    	Thread thread = new Thread(() -> {});
	    	// Print the thread's state (should be "NEW" at this point)
	    	thread.start();
	    	System.out.println("Thread state: " + thread.getState());
		}
	
	
		public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			// Create a new instance of ThreadState
			NewState threadState = new NewState();
			// Call the createNewThread() method to create a new thread and print its state
			threadState.createNewThread();
			threadState.createNewThread();
			
		} 
	}
	
	






