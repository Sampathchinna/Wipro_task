package casestudySql.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import casestudySql.db.DbConnection;

public class ReadService {
	
	public void viewAllStudents() {
	    try (Connection conn = DbConnection.getConnection()) {
	        String sql = "SELECT student_id, first_name, last_name, email, dob FROM students";
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();

	        System.out.println("Student List:");
	        System.out.printf("%-10s %-20s %-30s %-15s\n", "ID", "Name", "Email", "DOB");
	        System.out.println("---------------------------------------------------------------------------------");

	        while (rs.next()) {
	            int id = rs.getInt("student_id");
	            String name = rs.getString("first_name") + " " + rs.getString("last_name");
	            String email = rs.getString("email");
	            Date dob = rs.getDate("dob");

	            System.out.printf("%-10d %-20s %-30s %-15s\n", id, name, email, dob);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public void getStudentByEmail(String email) {
		try (Connection conn = DbConnection.getConnection()) {
            String sql = "SELECT * FROM students WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
            	System.out.println("Student Found:");
            	System.out.println("ID: "+rs.getInt("student_id"));
            	System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                System.out.println("DOB: " + rs.getDate("dob"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("Address: " + rs.getString("address"));
             } else {
                 System.out.println("No student found with that email.");
             }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	 public void showAllCoursesWithEnrolledStudents() {
	        try (Connection conn = DbConnection.getConnection()) {
	            String sql = """
	                SELECT s.first_name, s.last_name, c.course_name, e.enrollment_date
	                FROM enrollments e
	                JOIN students s ON e.student_id = s.student_id
	                JOIN courses c ON e.course_id = c.course_id
	            """;
	            
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            ResultSet rs=pstmt.executeQuery();
	            System.out.println("Courses with Enrolled Students:");
	            while (rs.next()) {
	                System.out.println(
	                    rs.getString("first_name") + " " +
	                    rs.getString("last_name") + " | " +
	                    rs.getString("course_name") + " | " +
	                    rs.getDate("enrollment_date"));
	            }
	            		
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 
	 public void showGradesForStudents(int studentId) {
		    try (Connection conn = DbConnection.getConnection()) {
		        String sql = """
		            SELECT s.first_name, c.course_name, e.grade
		            FROM enrollments e
		            JOIN students s ON e.student_id = s.student_id
		            JOIN courses c ON e.course_id = c.course_id
		            WHERE s.student_id = ?
		        """;

		        PreparedStatement pstmt = conn.prepareStatement(sql);
		        pstmt.setInt(1, studentId);

		        ResultSet rs = pstmt.executeQuery();

		        boolean found = false;
		        System.out.println("Grades for student ID " + studentId + ":");

		        while (rs.next()) {
		            found = true;
		            String name = rs.getString("first_name");
		            String course = rs.getString("course_name");
		            String grade = rs.getString("grade");

		            System.out.printf("Student: %s | Course: %s | Grade: %s\n", name, course, grade);
		        }

		        if (!found) {
		            System.out.println("❌ No grades found for this student.");
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}


}
