package April22;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
		static Consumer<Student> c1=p-> System.out.println(p);
		static Consumer<Student> c2=p-> System.out.println(p.getName().toUpperCase());
		static Consumer<Student> c3=p-> System.out.println(p.getActivities());
	
		
		public static void printName() {
			List<Student>  personList= StudentDataBase.getAllStudents();
			personList.forEach(c1);
		}
		public static void printNameAndActivity() {
			System.out.println("print name and activity");
			List<Student>  personList= StudentDataBase.getAllStudents();
			personList.forEach(c3.andThen(c2));
		}
		public static void printNameAndActivityUsingCondition() {
			System.out.println("print name and activities");
			List<Student>  personList= StudentDataBase.getAllStudents();
			personList.forEach((s)->{
				if(s.getGradeLevel()>=3 && s.getGpa()>3) {
					c2.andThen(c3).accept(s);
				}
			});
		}
	    public static void main(String[] args) {
	    	
	    	//printName();
	    	//printNameAndActivity();
	    	printNameAndActivityUsingCondition();
	    		
	        
	    } 

}
