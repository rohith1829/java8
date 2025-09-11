package functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = str -> str.length() > 5;

        System.out.println("Is 'Hello' length > 5? " + checkLength.test("Hello"));
        System.out.println("Is 'Functional' length > 5? " + checkLength.test("Functional"));
    }
}
