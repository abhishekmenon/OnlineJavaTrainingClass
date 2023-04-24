package April21;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args)
    {

   	 try {
   		 File Obj = new File("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\myfile.txt");
   		 
   		 if(Obj.exists()){
   			 System.out.println("File already exists.");
   		 }
   	 }
   	 catch (Exception e) {
   		 System.out.println("An error has occurred.");
   		 e.printStackTrace();
   	 }

    }
}
