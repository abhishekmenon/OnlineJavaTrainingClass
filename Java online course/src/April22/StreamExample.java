package April22;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
	
	//student name and there activities in a map
    Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
    Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);


    Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
            .filter(studentPredicate)
            .filter(studentgpaPredicate)
            .collect(Collectors.toMap(Student::getName,Student::getActivities));

    System.out.println(studentMap);
	}

}
