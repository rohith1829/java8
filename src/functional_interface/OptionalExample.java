package functional_interface;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        Optional<Integer> max = numbers.stream().max(Integer::compare);

        System.out.println(max.orElse(-1)); // default value if list is empty
    }
}
