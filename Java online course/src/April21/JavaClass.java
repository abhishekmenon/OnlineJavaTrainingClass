package April21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="John";
		int age=38;
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
		
		try {
			String filePathString="C:\\Users\\abhis\\Desktop\\JavaClassOnline\\output.txt";
			File file=new File(filePathString);
			
			if(file.exists()) {
				System.out.println("It exists already");
			}
			else {
				file.createNewFile();
				System.out.println("file created");
			}
			
			FileWriter writer=new FileWriter(file);
			writer.write("Name:"+name+"\n"+"Age:"+age);
			writer.close();
			System.out.println("succefully written");
		}
		catch (IOException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}

	}

}
