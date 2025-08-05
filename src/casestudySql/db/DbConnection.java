package casestudySql.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		 private static final String url = "jdbc:mysql://localhost:3306/student_management";
		 private static final  String user = "root";
		 private static final String password = "Solutions@9398";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }
    }
