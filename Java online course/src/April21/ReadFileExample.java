package April21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
	  public static void main(String[] args) {
		    File myObj = new File("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\output.txt");
		      //Scanner myReader = new Scanner(myObj);
		      if(myObj.delete()) {
		        
		        System.out.println("file Deleted");
		      }
		      else {
		    	  System.out.println("non existing");
		      }
		  }

}
