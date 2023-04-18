package April17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test2 {

		public static void main(String args[]){
			ArrayList<Student2> studentList = new ArrayList<>();
	 
			studentList.add(new Student2("Sandy", "MCA/07/06", 28));
			studentList.add(new Student2("Roxy", "MCA/07/32", 28));
			studentList.add(new Student2("Sunil", "MCA/07/15", 27));
			studentList.add(new Student2("Munish", "MCA/07/04", 27));
	 
			Collections.sort(studentList);
	 
			Iterator iterator=studentList.iterator();  
			while(iterator.hasNext()){  
				Student2 student=(Student2)iterator.next();  
				System.out.println("Name: " + student.getName()+
					  ", " + "RollNo: "+student.getRollNo()+
						", Age: "+student.getAge());  
			} 		
		}
	



}
