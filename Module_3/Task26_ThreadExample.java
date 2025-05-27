class MessageThread extends Thread {
    String msg;
    MessageThread(String msg) {
        this.msg = msg;
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg + " - " + i);
        }
    }
}

public class Task26_ThreadExample {
    public static void main(String[] args) {
        MessageThread t1 = new MessageThread("Hello");
        MessageThread t2 = new MessageThread("World");
        t1.start();
        t2.start();
    }
}

