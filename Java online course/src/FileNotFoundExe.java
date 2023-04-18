import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExe {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//"C:\Users\abhis\Desktop\TestFile.txt"
		
		try {
			
		 
		   	 try {
		   	 
		   		 int var1=10/0;
		   	 }
		   	 catch(Exception e){
		   		 System.out.println(e.getMessage());
		   	 }
		   	
	   	 
	   	FileReader file = new FileReader("C:\\Users\\abhis\\Desktop\\TestFile.txt");
	   	 
	   	 BufferedReader fileInput = new BufferedReader(file);
	   	 
	   	 for (int counter = 0; counter < 4; counter++)
	   		 System.out.println(fileInput.readLine());
	   	
	   	 fileInput.close();
	   	 
	   	 
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("The IO exception has been handled"+e.getMessage());
		}
		finally {
			System.out.println("This is out of main try catch");
		}
		System.out.println("This is out of try-catch");


	}

}
