package functional_interface;

import java.util.Arrays;
import java.util.List;

public class SortPersons {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rohith", 23, 50000),
                new Person("Varun", 20, 40000),
                new Person("Ravi", 25, 60000)
        );

        people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
        people.forEach(System.out::println);
    }
}
