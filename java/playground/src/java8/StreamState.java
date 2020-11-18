package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamState {

    public static void main(String[] args) {
        List<String>  limit = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limit);

        List<String>  skip = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skip);

        // May cause issue for state operation
        List<String>  skipParallel = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skipParallel);

        List<String>  unique = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        List<String>  alphabeticOrder = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alphabeticOrder);

        List<String>  alphabeticOrderParallel = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion")
                .parallel()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alphabeticOrderParallel);
    }
}
