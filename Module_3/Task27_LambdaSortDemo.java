import java.util.*;

public class Task27_LambdaSortDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "grape");

        Collections.sort(words, (a, b) -> a.compareTo(b));

        System.out.println("Sorted list:");
        words.forEach(System.out::println);
    }
}

