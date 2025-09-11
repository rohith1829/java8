package insurance_management;

import java.util.*;
import java.util.stream.*;

public class InsuranceApp {
    private static List<InsurancePolicy> policies = Arrays.asList(
            new InsurancePolicy("P101", "Alice", 1500),
            new InsurancePolicy("P102", "Bob", 900),
            new InsurancePolicy("P103", "Charlie", 2200),
            new InsurancePolicy("P104", "David", 1800),
            new InsurancePolicy("P105", "Smith", 2500),
            new InsurancePolicy("P106", "Sam", 800)
    );

    public static void filterByPremium() {
        policies.stream().filter(p -> p.getPremiumAmount() > 1200).forEach(System.out::println);
    }

    public static void sortByHolderName() {
        policies.stream().sorted(Comparator.comparing(InsurancePolicy::getHolderName)).forEach(System.out::println);
    }

    public static void computeTotalPremium() {
        double total = policies.stream().mapToDouble(InsurancePolicy::getPremiumAmount).sum();
        System.out.println("Total Premium: $" + total);
    }

    public static void printPolicyDetails() {
        policies.forEach(System.out::println);
    }

    public static void filterByPremiumRange() {
        policies.stream().filter(p -> p.getPremiumAmount() >= 1000 && p.getPremiumAmount() <= 2000).forEach(System.out::println);
    }

    public static void highestPremiumPolicy() {
        policies.stream().max(Comparator.comparingDouble(InsurancePolicy::getPremiumAmount)).ifPresent(System.out::println);
    }

    public static void groupByHolderInitial() {
        Map<Character, List<InsurancePolicy>> grouped = policies.stream()
                .collect(Collectors.groupingBy(p -> p.getHolderName().charAt(0)));
        grouped.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static void averagePremium() {
        double avg = policies.stream().mapToDouble(InsurancePolicy::getPremiumAmount).average().orElse(0.0);
        System.out.println("Average Premium: $" + avg);
    }

    public static void sortByPremiumAndPrint() {
        policies.stream().sorted(Comparator.comparingDouble(InsurancePolicy::getPremiumAmount)).forEach(System.out::println);
    }

    public static void checkPremiumExceeds() {
        boolean exists = policies.stream().anyMatch(p -> p.getPremiumAmount() > 2000);
        System.out.println("Any policy > $2000? " + exists);
    }

    public static void countPoliciesByRange() {
        long low = policies.stream().filter(p -> p.getPremiumAmount() <= 1000).count();
        long mid = policies.stream().filter(p -> p.getPremiumAmount() > 1000 && p.getPremiumAmount() <= 2000).count();
        long high = policies.stream().filter(p -> p.getPremiumAmount() > 2000).count();
        System.out.println("0-1000: " + low + ", 1001-2000: " + mid + ", >2000: " + high);
    }

    public static void uniqueHolderNames() {
        policies.stream().map(InsurancePolicy::getHolderName).distinct().forEach(System.out::println);
    }

    public static void findByNameSubstring() {
        policies.stream().filter(p -> p.getHolderName().contains("Smith")).forEach(System.out::println);
    }

    public static void mapPolicyToPremium() {
        Map<String, Double> map = policies.stream()
                .collect(Collectors.toMap(InsurancePolicy::getPolicyNumber, InsurancePolicy::getPremiumAmount));
        map.forEach((k, v) -> System.out.println(k + " -> $" + v));
    }

    public static void mostFrequentWords(String text, int n) {
        Map<String, Long> freq = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        freq.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(n).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    public static void secondMostRepeatedWord(String text) {
        Map<String, Long> freq = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        List<Map.Entry<String, Long>> sorted = freq.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).toList();
        if (sorted.size() > 1) {
            System.out.println("Second most repeated word: " + sorted.get(1).getKey());
        } else {
            System.out.println("Not enough words to find second most repeated.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nInsurance Operations Menu");
            System.out.println("1. Filter by Premium > 1200");
            System.out.println("2. Sort by Holder Name");
            System.out.println("3. Compute Total Premium");
            System.out.println("4. Print All Policy Details");
            System.out.println("5. Filter Premium Range (1000-2000)");
            System.out.println("6. Policy with Highest Premium");
            System.out.println("7. Group by Holder Name Initial");
            System.out.println("8. Average Premium");
            System.out.println("9. Sort by Premium and Print");
            System.out.println("10. Check if Any Policy > 2000");
            System.out.println("11. Count Policies by Ranges");
            System.out.println("12. Unique Holder Names");
            System.out.println("13. Find Policies by Substring (Smith)");
            System.out.println("14. Map Policy Numbers to Premiums");
            System.out.println("15. Most Frequent Words");
            System.out.println("16. Second Most Repeated Word");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> filterByPremium();
                case 2 -> sortByHolderName();
                case 3 -> computeTotalPremium();
                case 4 -> printPolicyDetails();
                case 5 -> filterByPremiumRange();
                case 6 -> highestPremiumPolicy();
                case 7 -> groupByHolderInitial();
                case 8 -> averagePremium();
                case 9 -> sortByPremiumAndPrint();
                case 10 -> checkPremiumExceeds();
                case 11 -> countPoliciesByRange();
                case 12 -> uniqueHolderNames();
                case 13 -> findByNameSubstring();
                case 14 -> mapPolicyToPremium();
                case 15 -> {
                    System.out.println("Enter text:");
                    String text = sc.nextLine();
                    mostFrequentWords(text, 5);
                }
                case 16 -> {
                    System.out.println("Enter text:");
                    String text = sc.nextLine();
                    secondMostRepeatedWord(text);
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
