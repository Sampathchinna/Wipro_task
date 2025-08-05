package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task1_JdbcConnection {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "Solutions@9398";

        try {
            // Load MySQL JDBC Driver
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful!");

            // Close connection
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}


