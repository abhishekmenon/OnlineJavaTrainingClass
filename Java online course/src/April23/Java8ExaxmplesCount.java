package April23;

import java.util.List;
import java.util.stream.Collectors;

import April22.Student;
import April22.StudentDataBase;

public class Java8ExaxmplesCount {
	    public static List<String> printStudentActivities(){

	        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
	                .map(Student::getActivities) //Stream<List<String>
	                .flatMap(List::stream) //Stream<String>
	                .distinct()
	                .sorted()
	                .collect(Collectors.toList());

	        return studentActivities;
	    }

	    public static long getStudentActivitiesCount(){

	        long noOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
	                .map(Student::getActivities) //Stream<List<String>
	                .flatMap(List::stream) //Stream<String>
	                .distinct() //Stream<String> -> with distinct function performed
	                .count();

	        return noOfStudentActivities;
	    }


	    public static void main(String[] args) {

	        System.out.println("printStudentActivities : " + printStudentActivities());
	        System.out.println("getStudentActivitiesCount : " + getStudentActivitiesCount());
	    }
	}



