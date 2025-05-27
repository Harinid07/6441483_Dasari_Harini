public class Task40_VirtualThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from VT: " + Thread.currentThread()));
        }
    }
}

