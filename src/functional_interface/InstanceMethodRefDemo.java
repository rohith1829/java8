package functional_interface;

import java.util.Arrays;
import java.util.List;

class Printer {
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}

public class InstanceMethodRefDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> messages = Arrays.asList("Hello", "Java", "Method Reference");

        messages.forEach(printer::printMessage);
    }
}
