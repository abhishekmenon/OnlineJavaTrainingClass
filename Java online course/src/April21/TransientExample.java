package April21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample implements Serializable
	{
	    
	    int i = 10, j = 20;
	   
	    transient int k = 30;
	    
	    transient static int l = 40;
	    transient final int m = 50;
	    public static void main(String[] args) throws Exception
	    {
	    	l=54;
	    	TransientExample input = new TransientExample();
	   	 // serialization
	   	 FileOutputStream fos = new FileOutputStream("abc.txt");
	   	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	   	 oos.writeObject(input);
	   	 // de-serialization
	   	 FileInputStream fis = new FileInputStream("abc.txt");
	   	 ObjectInputStream ois = new ObjectInputStream(fis);
	   	TransientExample output = (TransientExample)ois.readObject();
	   	 System.out.println("i = " + output.i);
	   	 System.out.println("j = " + output.j);
	   	 System.out.println("k = " + output.k);
	   	 System.out.println("l = " + output.l);
	   	 System.out.println("m = " + output.m);
	    }
	}




