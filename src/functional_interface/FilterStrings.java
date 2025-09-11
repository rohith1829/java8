package functional_interface;

import java.util.*;
import java.util.stream.*;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
        List<String> filtered = names.stream()
                                     .filter(s -> !s.startsWith("A"))
                                     .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
