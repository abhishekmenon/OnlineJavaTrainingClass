package April22;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
	
	static Predicate<Student> p1=(s)-> s.getGradeLevel()>=4;
	static Predicate<Student> p2=(s)-> s.getGpa()>=3.0;
	
	
	public static void filterStudentByGrade() {
		System.out.println("This is filteration of students based on grades");
		
		List<Student> studentList=StudentDataBase.getAllStudents();
			
			studentList.forEach((s)->{
			if(p1.test(s)) {
				System.out.println(s);
			}
					
			}
		);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterStudentByGrade();

	}

}
