package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Execise4_DisplayRecords {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Solutions@9398";
        
        try(
        	Connection conn=DriverManager.getConnection(url,username,password);
        	Statement stmt=conn.createStatement()){
        	
        	String query="SELECT * FROM Students";
        	ResultSet rs=stmt.executeQuery(query);
        	
        	System.out.println("Student records");
        	while(rs.next()) {
        		int id=rs.getInt("id");
        		String name=rs.getString("name");
        		String email=rs.getString("email");
        		
        		System.out.println(id+" | "+name+" | "+email);
        	}

        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
