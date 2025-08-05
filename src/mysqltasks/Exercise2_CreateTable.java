package mysqltasks;

import java.sql.*;

public class Exercise2_CreateTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Solutions@9398";
        
        try(
        	Connection conn=DriverManager.getConnection(url,username,password);
        	Statement stmt=conn.createStatement()){
        	
        	String createTableSql="CREATE TABLE IF NOT EXISTS Students("+"id INT PRIMARY KEY,"+"name VARCHAR(50),"+"email VARCHAR(50))";
        	stmt.execute(createTableSql);
        	System.out.println("Students table created successfully");
       }catch(Exception e) {
    	   e.printStackTrace();
}
	}

}
