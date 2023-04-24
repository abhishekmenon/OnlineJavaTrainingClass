package April21;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class DataStreamExample {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\f1.txt");    
      FileOutputStream fout2=new FileOutputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(78);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);
      
      String s="Heloo World";    
      byte b[]=s.getBytes();
      bout.write(b);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2); 
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
    }  

