public class Task12_OverloadDemo {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Task12_OverloadDemo obj = new Task12_OverloadDemo();
        System.out.println(obj.add(5, 3));        // int
        System.out.println(obj.add(5.5, 3.2));    // double
        System.out.println(obj.add(1, 2, 3));     // 3 ints
    }
}
