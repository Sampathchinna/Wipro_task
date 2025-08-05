package casestudySql.dao;


import casestudySql.db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateService {

    Scanner sc = new Scanner(System.in);

    // 1. Update Student Phone Number
    public void updateStudentPhone() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter New Phone Number: ");
            String phone = sc.nextLine();

            String sql = "UPDATE students SET phone = ? WHERE student_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phone);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Update Student Grade
    public void updateStudentGrade() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Enrollment ID: ");
            int eid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Grade: ");
            String grade = sc.nextLine();

            String sql = "UPDATE enrollments SET grade = ? WHERE enrollment_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, grade);
            pstmt.setInt(2, eid);

            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Update Course Description
    public void updateCourseDescription() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Course ID: ");
            int cid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Description: ");
            String desc = sc.nextLine();

            String sql = "UPDATE courses SET course_description = ? WHERE course_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, desc);
            pstmt.setInt(2, cid);

            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

