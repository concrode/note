package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo1 {

    public static void main(String[] args) {
        List<String>  alpha =Arrays.asList("Monkey", "Lion", "Giraffe");

        List<String> alphaUpper = new ArrayList<>();
        for (String s: alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alphaUpper);

        List<String> alphaUpper2 = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(alphaUpper2);

    }
}
