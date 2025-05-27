import java.util.HashMap;
import java.util.Scanner;

public class Task25_HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to lookup: ");
        int searchId = sc.nextInt();
        String result = studentMap.get(searchId);
        System.out.println(result != null ? "Student: " + result : "Student not found.");
    }
}
