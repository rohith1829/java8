package functional_interface;

import java.util.function.BiFunction;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        BiFunction<String, Integer, Person> personCreator = Person::new;

        Person p1 = personCreator.apply("Rohith", 22);
        Person p2 = personCreator.apply("Varun", 25);

        p1.display();
        p2.display();
    }
}