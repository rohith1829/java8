package stream_api;

import java.util.*;


public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(10, 55, 60, 45, 90, 30, 75);
        System.out.println("Filter (Numbers > 50):");
        numbers1.stream()
                .filter(n -> n > 50)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("Java", "Lambda", "Streams");
        System.out.println("\nMap (Word Lengths):");
        words.stream()
             .map(String::length)
             .forEach(System.out::println);

        List<String> names = Arrays.asList("Rohith", "Varun", "Yaswant", "Ravi");
        System.out.println("\nSorted (Names Ascending):");
        names.stream()
             .sorted()
             .forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        System.out.println("\nDistinct (Unique Numbers):");
        numbers2.stream()
                .distinct()
                .forEach(System.out::println);

        List<Integer> numbers3 = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        System.out.println("\nLimit & Skip (First 3 Even Numbers after Skipping 2):");
        numbers3.stream()
                .skip(2)
                .filter(n -> n % 2 == 0)
                .limit(3)
                .forEach(System.out::println);

        List<Integer> numbers4 = Arrays.asList(5, 10, 15, 20, 25, 30);
        System.out.println("\nPeek (Debug Even Numbers):");
        numbers4.stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filter: " + n))
                .forEach(System.out::println);
    }
}
