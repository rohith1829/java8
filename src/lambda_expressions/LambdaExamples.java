package lambda_expressions;
import java.util.*;

public class LambdaExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted Strings (Reverse Alphabetical): " + names);

        Runnable r = () -> System.out.println("Hello from Lambda Runnable!");
        Thread t = new Thread(r);
        t.start();

        List<Employee> employees = Arrays.asList(
                new Employee(3, "Charlie"),
                new Employee(1, "Alice"),
                new Employee(2, "Bob")
        );
        employees.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        System.out.println("Employees sorted by ID: " + employees);
    }
}