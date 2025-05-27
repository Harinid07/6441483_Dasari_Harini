import java.util.*;

record Person(String name, int age) {}

public class Task29_RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Carol", 40)
        );

        people.stream()
              .filter(p -> p.age() > 30)
              .forEach(System.out::println);
    }
}
