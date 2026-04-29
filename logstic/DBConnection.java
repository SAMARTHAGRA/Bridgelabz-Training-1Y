import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3301/RouteDB";
        String user = "root";
        String password = "Sandeep@1714";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}