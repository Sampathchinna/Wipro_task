package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise3_InsertData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Solutions@9398";
        
        try(
        	Connection conn=DriverManager.getConnection(url,username,password);
        	Statement stmt=conn.createStatement()){
        	
        	String s1="INSERT INTO Students (id,name,email) VALUES (1,'sampath','sampath@18.com')";
        	String s2="INSERT INTO Students (id,name,email) VALUES (2,'viart','virat18.com')";
        	stmt.executeUpdate(s1);
        	stmt.executeUpdate(s2);
        	
        	System.out.println("two students records added succesfully");
        	
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
        	
        

	}
}
