import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Spring {

   public static void main(String [] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 250);
        marks.put("Radha", 450);

        for(Map.Entry<String, Integer> entry: marks.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //sets  -- learning my self
        //Lists, map, sets, Immutable list 


        // System.out.println("\n The student marks : " + marks) ;

        //optionals
        Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("rohit"));
        if(marksOfRohit.isPresent() ){

        }else{
            System.out.println("Absent");
        }

        //Integer m = getmarks();

    }
}
