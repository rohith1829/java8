package functional_interface;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Functional", "Lambda", "Programming", "Awesome", "API");

        Predicate<String> lengthCheck = s -> s.length() > 5;
        Predicate<String> containsSub = s -> s.contains("a") || s.contains("A");

        List<String> result = words.stream()
                                   .filter(lengthCheck.and(containsSub))
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}

