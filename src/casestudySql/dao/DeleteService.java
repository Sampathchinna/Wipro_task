package casestudySql.dao;

import casestudySql.db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteService {

    Scanner sc = new Scanner(System.in);

    // 1. Delete specific enrollment
    public void deleteEnrollmentById() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Enrollment ID to delete: ");
            int eid = sc.nextInt();

            String sql = "DELETE FROM enrollments WHERE enrollment_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, eid);

            int rows = pstmt.executeUpdate();
            System.out.println("✅ Deleted enrollments: " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Delete student + their enrollments
    public void deleteStudentById() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Student ID to delete: ");
            int sid = sc.nextInt();

            // Step 1: delete enrollments of this student
            String delEnrollments = "DELETE FROM enrollments WHERE student_id = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(delEnrollments);
            pstmt1.setInt(1, sid);
            pstmt1.executeUpdate();

            // Step 2: delete student
            String delStudent = "DELETE FROM students WHERE student_id = ?";
            PreparedStatement pstmt2 = conn.prepareStatement(delStudent);
            pstmt2.setInt(1, sid);
            int rows = pstmt2.executeUpdate();

            System.out.println("Deleted student and related enrollments. Students removed: " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Delete course (assumes enrollments are deleted first externally)
    public void deleteCourseById() {
        try (Connection conn = DbConnection.getConnection()) {
            System.out.print("Enter Course ID to delete: ");
            int cid = sc.nextInt();

            // Optional: delete enrollments first (PDF doesn't mention this, but you can add if needed)

            String delCourse = "DELETE FROM courses WHERE course_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(delCourse);
            pstmt.setInt(1, cid);
            int rows = pstmt.executeUpdate();

            System.out.println("Deleted course(s): " + rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

