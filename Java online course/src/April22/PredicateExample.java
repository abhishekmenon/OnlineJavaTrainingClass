package April22;

import java.lang.annotation.Retention;
import java.util.function.Predicate;

import April14.ReturnTypeArray;

public class PredicateExample {
	static Predicate<Integer> p=(i)->{ return i%2==0;};
	
	static Predicate<Integer> p1=(i)->{
		return i%5==0;
	};
	
	public static void predictAnd() {
		System.out.println(p.and(p1).test(10));
	}
	public static void predictOr() {
		System.out.println(p.or(p1).test(10));
		}
	public static void predictNegate() {
		System.out.println(p.and(p1).negate().test(10));
	}
	
	public static void main(String[] args) {
		//System.out.println(p.test(3));
		predictAnd();
		predictOr();
		predictNegate();
	}
}
