package April23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	    public static int performMultiplication(List<Integer> integerList){

	        return integerList.stream()
	                //1
	                //3
	                //5
	                //7
	                .reduce(1,(a,b) -> a*b);

	    }

	    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){

	        return integerList.stream()
	                //1
	                //3
	                //5
	                //7
	                .reduce((a,b) -> a*b);

	    }

	    public static void main(String[] args) {

	        List<Integer> integers = Arrays.asList(1,3,5,7);

	        List<Integer> integers1 = new ArrayList<>();

	        //System.out.println(performMultiplication(integers));

//	        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
//
//	        System.out.println(result.isPresent());
//	        System.out.println(result.get());

	        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
	        System.out.println(result1.isPresent());

	        if(result1.isPresent()){
	            System.out.println(result1.get());
	        }

	    }
	


}
