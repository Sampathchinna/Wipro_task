package casestudySql.dao;

import casestudySql.db.*;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class CreateService {
	
	public void addStudent() {
		Scanner sc=new Scanner(System.in);
		try(Connection conn=DbConnection.getConnection()){
			String sql="INSERT INTO students(first_name, last_name, dob, email, phone, address) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			
			System.out.println("First Name: ");
			pstmt.setString(1,sc.nextLine());
			
			System.out.println("Last Name: ");
			pstmt.setString(2, sc.nextLine());
			
			System.out.println("Date of Birth (YYYY-MM-DD): ");
			pstmt.setDate(3, Date.valueOf(sc.nextLine()));
			
			System.out.print("Email: ");
            pstmt.setString(4, sc.nextLine());

            System.out.print("Phone: ");
            pstmt.setString(5, sc.nextLine());

            System.out.print("Address: ");
            pstmt.setString(6, sc.nextLine());
            
            int rows=pstmt.executeUpdate();
            System.out.println("Students added. Rows affected: "+rows);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addCourse() {
	    Scanner sc = new Scanner(System.in);
	    try (Connection conn = DbConnection.getConnection()) {
	        String sql = "INSERT INTO courses (course_name, course_description, credits) VALUES (?, ?, ?)";
	        PreparedStatement pstmt = conn.prepareStatement(sql);

	        System.out.print("Course Name: ");
	        String name = sc.nextLine();
	        pstmt.setString(1, name);

	        System.out.print("Course Description: ");
	        String desc = sc.nextLine();
	        pstmt.setString(2, desc);

	        System.out.print("Credits: ");
	        int credits = sc.nextInt();
	        pstmt.setInt(3, credits);

	        int rows = pstmt.executeUpdate();
	        System.out.println("✅ Course added. Rows affected: " + rows);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void enrollStudent() {
	    Scanner sc = new Scanner(System.in);
	    try (Connection conn = DbConnection.getConnection()) {
	        String sql = "INSERT INTO enrollments (student_id, course_id, enrollment_date, grade) VALUES (?, ?, CURDATE(), NULL)";
	        PreparedStatement pstmt = conn.prepareStatement(sql);

	        System.out.print("Enter Student ID: ");
	        int sid = sc.nextInt();
	        System.out.print("Enter Course ID: ");
	        int cid = sc.nextInt();

	        pstmt.setInt(1, sid);
	        pstmt.setInt(2, cid);

	        int rows = pstmt.executeUpdate();
	        System.out.println("✅ Student enrolled in course. Rows affected: " + rows);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
