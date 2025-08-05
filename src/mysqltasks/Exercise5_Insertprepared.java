package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Exercise5_Insertprepared {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Solutions@9398";
        
        try(
        	Connection conn=DriverManager.getConnection(url,username,password)){
        	String insertSQl="INSERT INTO Students(id,name,email) VALUES (?,?,?)";
        	PreparedStatement pstmt=conn.prepareStatement(insertSQl);
        	
        	pstmt.setInt(1, 3);
        	pstmt.setString(2, "samuel");
        	pstmt.setString(3, "samuel@12.com");
        	pstmt.executeUpdate();
        	
        	System.out.println("Records added using PreparedStatement.");
        
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
