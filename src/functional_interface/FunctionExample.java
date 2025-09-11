package functional_interface;

import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Double, Double> area = r -> Math.PI * r * r;

        double radius = 5.0;
        System.out.println("Area of circle: " + area.apply(radius));
    }
}
