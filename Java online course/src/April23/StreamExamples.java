package April23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples{
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for(String name : names){
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        List<String> nameStream = names.stream().collect(Collectors.toList());
       for(String i:nameStream) {
    	   System.out.println(i);
       }
        
        
       // nameStream.forEach(System.out::println);


    }
}


