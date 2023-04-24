package April22;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnarayExample {
	
	static UnaryOperator<String> unaryOperator=(s)->s.concat("default");
	
	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);
	
	
	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("java"));
		
		BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
		
		
		System.out.println(binaryOperator.apply(3,4));
		
		System.out.println(comparator.compare(5,6));
	}

}
