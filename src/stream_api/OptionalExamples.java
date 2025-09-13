package stream_api;

import java.util.*;

public class OptionalExamples {

    static Optional<String> getUsername(String username) {
        return Optional.ofNullable(username);
    }

    static String getEmail(String email) {
        return Optional.ofNullable(email).orElse("default@email.com");
    }

    static String getValueOrThrow(String value) {
        return Optional.ofNullable(value)
                .orElseThrow(() -> new RuntimeException("Value is missing"));
    }

    static Optional<String> convertToUpper(String input) {
        return Optional.ofNullable(input).map(String::toUpperCase);
    }

    static int multiplyIfPresent(Optional<Integer> num) {
        return num.map(n -> n * 2).orElse(-1);
    }

    static Optional<Student> findStudentById(int id, List<Student> students) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println("1. Username:");
        System.out.println(getUsername("Rohith"));
        System.out.println(getUsername(null));

        System.out.println("\n2. Email:");
        System.out.println(getEmail("test@gmail.com"));
        System.out.println(getEmail(null));

        System.out.println("\n3. Value Or Throw:");
        try {
            System.out.println(getValueOrThrow("Hello"));
            System.out.println(getValueOrThrow(null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n4. Convert to Uppercase:");
        System.out.println(convertToUpper("java").orElse("Empty"));
        System.out.println(convertToUpper(null).orElse("Empty"));

        System.out.println("\n5. Multiply if Present:");
        System.out.println(multiplyIfPresent(Optional.of(10)));
        System.out.println(multiplyIfPresent(Optional.empty()));

        System.out.println("\n6. Find Student By Id:");
        List<Student> students = Arrays.asList(
                new Student(1, "Rohith"),
                new Student(2, "Varun"),
                new Student(3, "Ravi")
        );
        findStudentById(2, students).ifPresent(System.out::println);
        findStudentById(5, students).ifPresent(System.out::println);
    }
}
