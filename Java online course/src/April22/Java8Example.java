package April22;
//class RunnableExe implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("Run this method");
//		
//	}
//	
//}

public class Java8Example {
	
	public static void main(String[] args) {
		
		
		   //RunnableExe run1=new RunnableExe();
		
		
		   Runnable runnable = new Runnable() {
				@Override
				public void run() {
				System.out.println("Inside Runnable 1");
				}
			};
			
			
			Runnable runnableLambda = () -> {
				System.out.println("Inside Runnable2");
			};

			
			Thread t1=new Thread(runnableLambda);
			t1.start();

	}
	

}
