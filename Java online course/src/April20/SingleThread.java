package April20;

public class SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100000000;
		
		
		long startTime=System.currentTimeMillis();
		long sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("Sum of all the n"+n+" no: "+sum);
		System.out.println("Time takaen for exe:"+(endTime-startTime)+" ms");

	}

}
