package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Execise6_UpdateRecord {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Solutions@9398";
        
        try(
        	Connection conn=DriverManager.getConnection(url,username,password)){
        	String updateSQL="UPDATE Students SET email=? WHERE id=?";
        	PreparedStatement pstmt=conn.prepareStatement(updateSQL);
        	
        	pstmt.setString(1, "sam@123.com");
        	pstmt.setInt(2,1);
        	int rowsAffected=pstmt.executeUpdate();
        	
        	System.out.println("Email updated. Rows affected: "+rowsAffected);
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
