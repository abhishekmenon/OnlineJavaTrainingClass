package April23;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import April22.Student;
import April22.StudentDataBase;

public class ExampleMap {

	    public static List<String> namesList(){

	        List<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
	                //Student as an input -> Student Name
	                .map(Student::getName) //Stream<String>
	                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
	                .collect(Collectors.toList()); //List<String>

	        return studentList;

	    }
	    public static Set<String> namesSet(){

	        Set<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
	                //Student as an input -> Student Name
	                .map(Student::getName) //Stream<String>
	                .map(String::toLowerCase) //Stream<String> -> uppercase operation on each input
	                .collect(Collectors.toSet()); //Set<String>

	        return studentList;

	    }
	    public static void main(String[] args) {

	        //System.out.println(namesList());
	        System.out.println(namesSet());

	    }
	}


