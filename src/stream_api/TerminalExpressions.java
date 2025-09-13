package stream_api;

import java.util.*;
import java.util.stream.*;

public class TerminalExpressions {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Streams", "Lambda", "Functional");
        strings.forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        Set<Integer> numSet = nums.stream().collect(Collectors.toSet());
        System.out.println(numSet);

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);
        int product = nums2.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);

        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Ravi", "Anu");
        long countA = names.stream().filter(n -> n.startsWith("A")).count();
        System.out.println(countA);

        List<Employee> employees = Arrays.asList(
                new Employee("Rohith", 50000),
                new Employee("Varun", 60000),
                new Employee("Yaswant", 45000),
                new Employee("Ravi", 70000)
        );
        employees.stream()
                 .max(Comparator.comparingDouble(Employee::getSalary))
                 .ifPresent(System.out::println);

        List<Student> students = Arrays.asList(
                new Student("A", 95),
                new Student("B", 45),
                new Student("C", 30),
                new Student("D", 85)
        );
        boolean anyAbove90 = students.stream().anyMatch(s -> s.getScore() > 90);
        boolean allPassed = students.stream().allMatch(s -> s.getScore() >= 35);
        boolean noneFailed = students.stream().noneMatch(s -> s.getScore() < 35);

        System.out.println(anyAbove90);
        System.out.println(allPassed);
        System.out.println(noneFailed);

        List<String> words = Arrays.asList("Hi", "World", "Lambda", "StreamAPI", "Rohith");
        words.stream()
             .filter(w -> w.length() > 5)
             .findFirst()
             .ifPresent(System.out::println);
    }
}
