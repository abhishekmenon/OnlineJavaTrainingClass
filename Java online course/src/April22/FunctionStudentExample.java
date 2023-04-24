package April22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionStudentExample {
	static Function<List<Student>,Map<String,Double>> studentFunction= (
		students->{
			Map<String,Double> studentGrade=new HashMap<>();
			students.forEach((student->{
				if(PredicateStudentExample.p1.test(student)) {
					studentGrade.put(student.getName(),student.getGpa());
				}
			}));
			return studentGrade;
		
	});
	//For supplier Interface 
	//private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
		
		
//			For supplier Interface
//        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
//        LocalDateTime time = s.get();
//
//        System.out.println(time);
	}
}
