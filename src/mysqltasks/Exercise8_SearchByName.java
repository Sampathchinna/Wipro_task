package mysqltasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Exercise8_SearchByName {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Solutions@9398";

        try (Connection conn = DriverManager.getConnection(url, user, password);
        		Scanner sc=new Scanner(System.in)){
        	
        	System.out.println("Enter a name to search");
        	String nameInput=sc.nextLine();
        	
        	String searchSql="SELECT * FROM Students WHERE name LIKE ?";
        	PreparedStatement pstmt=conn.prepareStatement(searchSql);
        	pstmt.setString(1,"%"+ nameInput+ "%");
        	
        	ResultSet rs=pstmt.executeQuery();
        	System.out.println("Matching Records:");
        	
        	while(rs.next()) {
        		System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email"));
        	}
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}
