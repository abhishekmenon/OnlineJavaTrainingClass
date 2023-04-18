

import java.io.*;
// Main class
class Test {
    // Main driver method
    public static void main(String[] args) throws IOException
    {   	 // Reading file from path in local directory
   	 FileReader file = new FileReader("C:\\Users\\abhis\\Desktop\\TestFile.txt");
   	 // Creating object as one of ways of taking input
   	 BufferedReader fileInput = new BufferedReader(file);
   	 // Printing first 3 lines of file ""C:\Users\abhis\Desktop\TestFile.txt""
   	 for (int counter = 0; counter < 3; counter++)
   		 System.out.println(fileInput.readLine());
   	 // Closing file connections
   	 // using close() method
   	 fileInput.close();
   	 
   	 
   	 try {
   		 
   	 }
   	 
    }
}

