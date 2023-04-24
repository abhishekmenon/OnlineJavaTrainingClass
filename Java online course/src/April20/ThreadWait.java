package April20;

public class ThreadWait {

		public void createWaitingThread()
		{
	    	// Create a new thread and start it
	    	Thread thread1 = new Thread(new Thread1Task());
	    	thread1.start();
	 
	    	// Exit the program
	    	System.exit(0);
		}
		
		public static void main(String[] args) {
			ThreadWait threadState = new ThreadWait();
			threadState.createWaitingThread();

		}
	

	class Thread1Task extends Thread
	{
		@Override
		public void run()
		{
	    	// Create a new thread and start it
	    	Thread thread2 = new Thread(new Thread2Task());
	    	thread2.start();
	   	 
	    	// Wait for thread2 to complete before continuing
	    	try {
	        	thread2.join();
	    	} catch (InterruptedException e) {
	        	e.printStackTrace();
	    	}
	    	// Thread1 is in waiting state until thread2 finishes execution
		}
	}

	class Thread2Task extends Thread
	{
		@Override
		public void run()
		{
			Thread thread1 = new Thread(new Thread1Task());
			thread1.start();
	    	try {
	        	// Sleep for 2 seconds to simulate some work being done
	        	Thread.sleep(2000);
	    	} catch (InterruptedException e) {
	        	e.printStackTrace();
	    	}
	    	// Thread2 finishes execution and thread1 continues execution
	    	System.out.println("Thread1 State: " + thread1.getState());
		}
	}
	

	


}
