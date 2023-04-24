package April23;

import java.util.List;

import java.util.stream.Collectors;

import April22.Student;
import April22.StudentDataBase;

public class FlatMapExample {
	
	    public static List<String> printStudentActivities(){

	       List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
	                .map(Student::getActivities) //Stream<List<String>>
	                .flatMap(List::stream).distinct() //Stream<String>
	                .collect(Collectors.toList());
	       
	       
	       

	        return studentActivities;
	    }


	    public static void main(String[] args) {

	        System.out.println("printStudentActivities : " + printStudentActivities());
	    }
}


