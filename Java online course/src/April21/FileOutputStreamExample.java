package April21;


	import java.io.FileOutputStream;  
	public class FileOutputStreamExample {
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\ABC.txt");    
	             String s="Welcome to javapoint.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	} 



