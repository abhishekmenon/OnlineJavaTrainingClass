package April20;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName());
	}
	public void run(int x)
	{
		System.out.println("value of x:"+x);
		for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
public class priorityyield {
	public static void main(String s[])
	{
	MyThread t=new MyThread();
	t.start();
	for(int i=0;i<5;i++)
	{
		MyThread.yield();
		System.out.println(Thread.currentThread().getName());
	 }
	}          
}


