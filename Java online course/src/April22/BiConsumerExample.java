package April22;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
	
	public static void nameActivity() {
	BiConsumer<String,List<String>> studentConsumer=(name,activities)->System.out.println(name+":"+activities);
	Consumer<String> stringConsumer=(name)-> System.out.print(name);
	List<Student> students=StudentDataBase.getAllStudents();
	students.forEach((s)->studentConsumer.accept(s.getName(),s.getActivities()));
	
	}
	public static void main(String[] args) {
		
//		BiConsumer<String,String> biConsumer=(a,b)->{
//			System.out.println("a:"+a+"b:"+b);
//		};
//		biConsumer.accept("java7","java9" );
//		
		nameActivity();
		
		
	}
}
