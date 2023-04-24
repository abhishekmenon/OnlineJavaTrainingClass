package April21;

	import java.io.*;
	public class ByteStreamExample{
	    public static void main(
	   	 String[] args) throws IOException
	    {
	   	 FileReader sourceStream = null;
	   	 try {
	   		 sourceStream
	   			 = new FileReader("C:\\Users\\abhis\\Desktop\\JavaClassOnline\\output.txt");

	   		 // Reading sourcefile and
	   		 // writing content to target file
	   		 // character by character.
	   		 int temp;
	   		 while ((
	   				 temp = sourceStream.read())
	   			 != -1)
	   			 System.out.print((char)temp);
	   	 }
	   	 finally {
	   		 // Closing stream as no longer in use
	   		 if (sourceStream != null)
	   			 sourceStream.close();
	   	 }
	    }
	}





