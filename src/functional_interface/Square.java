package functional_interface;

@FunctionalInterface
public interface Square {
    int calculate(int n);

    default void printSquare(int n) {
        System.out.println("Square of " + n + " is: " + calculate(n));
    }
}