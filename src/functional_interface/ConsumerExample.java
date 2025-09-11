package functional_interface;

import java.util.*;
import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "consumer");

        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

        words.forEach(printUpper);
    }
}

