import java.sql.*;

public class Task32_InsertingAndUpdatingJDBC {
    private Connection conn;

    public Task32_InsertingAndUpdatingJDBC(Connection conn) {
        this.conn = conn;
    }

    public void insertStudent(int id, String name, int age) throws SQLException {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
        }
    }

    public void updateStudentName(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            Task32_InsertingAndUpdatingJDBC dao = new Task32_InsertingAndUpdatingJDBC(conn);
            dao.insertStudent(1, "Alice", 20);
            dao.updateStudentName(1, "Alicia");
            System.out.println("Insert and update done.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
