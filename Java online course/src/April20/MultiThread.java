package April20;

import javax.xml.stream.events.StartDocument;

public class MultiThread {

	
	private static final int NUM_THREADS=5;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		int n=100000000;
		
		long startTime=System.currentTimeMillis();
		long sum=0;
		
		//1-25
		//1-5,6-10,11-15,16-20,21-25
		SumThread[] threads=new SumThread[NUM_THREADS];
		
		for(int i=0;i<NUM_THREADS;i++) {
			threads[i]=new SumThread((i*n)/NUM_THREADS+1, ((i+1)*n)/NUM_THREADS);
			threads[i].start();
		}
		
		for(int i=0;i<NUM_THREADS;i++) {
			threads[i].join();
			sum+=threads[i].getSum();
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println("sum of num"+sum);
		System.out.println("Time taken"+(endTime-startTime)+"ms");
		

	}
	
	private static class SumThread extends Thread{
		private final int start;
		private final int end;
		
		
		private long sum=0;
		
		
		public SumThread(int start,int end){
			this.start=start;
			this.end=end;
		}
		public void run() {
			for(int i=start;i<=end;i++) {
				sum+=i;
			}
		}
		public long getSum() {
			return sum;
		}
	}

}
