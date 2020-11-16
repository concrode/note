package java8;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reference:https://www.bilibili.com/video/BV1sE411P7C1?p=1
 *
 */
public class StreamDemo1 {

    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList("hello", "ji", "james", "jack", "ojf", "john");

        List<String> sortedNames = names.stream().
                filter(s -> s.startsWith("j"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);

        String[] players = {"hello", "ji", "james", "jack", "ojf", "john"};
        Stream.of(players).filter(s -> s.startsWith("j")).map(String::toUpperCase);

        // File convert to stream
        Stream<String> stringStream = Files.lines(Paths.get("file.txt"));

    }
}
