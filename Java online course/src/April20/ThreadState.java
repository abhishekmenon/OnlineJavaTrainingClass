package April20;
public class ThreadState {
	class Task extends Thread{
		@Override
		public void run() {
	    	performTask();
		}
	    
		public synchronized void performTask() {
	    	while(true) {
	        	// Thread1 will run forever, holding the lock, and preventing thread2 from executing
	    	}
		}
	}
	public void createBlockedThread() throws InterruptedException {
    	// Create two new threads, each running the Task object
    	Thread thread1 = new Thread(new Task());
    	Thread thread2 = new Thread(new Task());

    	// Start the first thread
    	thread1.start();
    	// Sleep for one second to give thread1 a chance to acquire the lock
    	Thread.sleep(1000);
   
    	// Start the second thread
    	thread2.start();
    	// Sleep for one second to give thread2 a chance to block
    	Thread.sleep(1000);
    	// Print the state of thread2 (should be "BLOCKED" at this point)
    	System.out.println("Thread2 state: " + thread2.getState());
 
    	// Exit the program
    	System.exit(0);
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadState threadState = new ThreadState();
		// Call the createBlockedThread() method to create two threads, start them, and print the state of one of them
		threadState.createBlockedThread();
		
		ThreadState threadState2 = new ThreadState();
		// Call the createBlockedThread() method to create two threads, start them, and print the state of one of them
		threadState.createBlockedThread();
	}
	
}






