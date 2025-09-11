package functional_interface;

public class CustomInterfaceExample {
    public static void main(String[] args) {
        Square sq = x -> x * x;
        sq.printSquare(6);
    }
}