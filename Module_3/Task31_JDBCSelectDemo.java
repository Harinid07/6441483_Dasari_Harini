import java.sql.*;

public class Task31_JDBCSelectDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

