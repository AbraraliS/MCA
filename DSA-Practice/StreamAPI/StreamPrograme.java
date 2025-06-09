package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPrograme {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(null, 1, 2, 3, 4, 5, null, 6, 7, null);
        // Stream<Integer> stream = ls.stream();
       
    //    Predicate<Integer> predicate = n ->  n % 2 == 1; 
       
        ls.stream()
            .filter(n -> n %2 == 1)
            .sorted() // Filter out null values
            .map(n -> n * 2) // Double each value
            .forEach(System.out::println); // Print each value
        // stream.forEach(n -> System.out.println(n));
        
    
    }   
}
