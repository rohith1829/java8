package functional_interface;

public class Person {
    String name;
    int age;
    double salary;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + age + " - " + salary;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
