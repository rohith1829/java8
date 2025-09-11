package functional_interface;

import java.util.function.Predicate;

public class StaticMethodRefDemo {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Predicate<Integer> evenCheck = StaticMethodRefDemo::isEven;

        System.out.println("Is 10 even? " + evenCheck.test(10));
        System.out.println("Is 15 even? " + evenCheck.test(15));
    }
}
