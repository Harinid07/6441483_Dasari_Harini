import java.util.concurrent.*;

public class Task41_ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> "Result from Task 1";
        Callable<String> task2 = () -> "Result from Task 2";

        Future<String> result1 = executor.submit(task1);
        Future<String> result2 = executor.submit(task2);

        System.out.println(result1.get());
        System.out.println(result2.get());

        executor.shutdown();
    }
}

