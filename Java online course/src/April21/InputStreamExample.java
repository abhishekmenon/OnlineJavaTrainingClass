package April21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class InputStreamExample {    
	public static void main(String args[])throws Exception{    
		   FileInputStream fin1=new FileInputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\Input.txt");    
		   FileInputStream fin2=new FileInputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\Output.txt");    
		   FileOutputStream fout=new FileOutputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\testout.txt");      
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   while((i=sis.read())!=-1)    
		   {    
		     fout.write(i);        
		   }    
		   sis.close();    
		   fout.close();      
		   fin1.close();      
		   fin2.close();       
		   System.out.println("Success..");  
		  }    

}	

