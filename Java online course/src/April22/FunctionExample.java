package April22;

import java.util.function.Function;

public class FunctionExample {

	static Function<Integer,Float> function=(name)->{return (float)name*name;};
	static Function<String,String> function2=(name)->name.toUpperCase().concat("default");
	
	public static void main(String[] args) {
		System.out.println(function.apply(5));
		
		
		//System.out.println(function.andThen(function2).apply("Abhishek is learning"));
		
	}
}
