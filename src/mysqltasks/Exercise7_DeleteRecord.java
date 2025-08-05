package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise7_DeleteRecord {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Solutions@9398";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String deleteSQL = "DELETE FROM Students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
            
            pstmt.setInt(1, 3);
            int rowsAffected=pstmt.executeUpdate();
            
            System.out.println("records deleted.Rows affected: "+rowsAffected);        
            
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}}
