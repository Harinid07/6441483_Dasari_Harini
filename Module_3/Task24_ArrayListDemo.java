import java.util.ArrayList;
import java.util.Scanner;

public class Task24_ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        
        System.out.println("Enter student names (type 'end' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            students.add(name);
        }

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

