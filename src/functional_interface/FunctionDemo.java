package functional_interface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> evenOdd = n -> (n % 2 == 0) ? "Even" : "Odd";

        System.out.println("10 is " + evenOdd.apply(10));
        System.out.println("15 is " + evenOdd.apply(15));
    }
}
