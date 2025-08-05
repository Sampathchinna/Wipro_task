package casestudySql.app;




import java.util.Scanner;

import casestudySql.dao.CreateService;
import casestudySql.dao.DeleteService;
import casestudySql.dao.ReadService;
import casestudySql.dao.UpdateService;

public class TestApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CreateService createService = new CreateService();
        ReadService readService = new ReadService();
        UpdateService updateService = new UpdateService();
        DeleteService deleteService = new DeleteService();

        while (true) {
            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Service");
            System.out.println("2. Read Service");
            System.out.println("3. Update Service");
            System.out.println("4. Delete Service");
            System.out.println("5. Exit");
            System.out.print("Choose a service: ");
            int serviceChoice = sc.nextInt();

            switch (serviceChoice) {
                case 1:
                    System.out.println("--- CREATE SERVICE ---");
                    System.out.println("1. Add Student");
                    System.out.println("2. Add Course");
                    System.out.println("3. Enroll Student");
                    System.out.print("Enter choice: ");
                    int createChoice = sc.nextInt();
                    switch (createChoice) {
                        case 1:
                            createService.addStudent();
                            break;
                        case 2:
                            createService.addCourse();
                            break;
                        case 3:
                            createService.enrollStudent();
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;

                case 2:
                    System.out.println("--- READ SERVICE ---");
                    System.out.println("1. View All Students");
                    System.out.println("2. Get Student by Email");
                    System.out.println("3. Show Courses with Enrolled Students");
                    System.out.println("4. Show Grades for a Student");
                    System.out.print("Enter choice: ");
                    int readChoice = sc.nextInt();
                    switch (readChoice) {
                        case 1:
                            readService.viewAllStudents();
                            break;
                        case 2:
                            System.out.print("Enter Student Email: ");
                            sc.nextLine(); 
                            String email = sc.nextLine();
                            readService.getStudentByEmail(email);
                            break;
                        case 3:
                            readService.showAllCoursesWithEnrolledStudents();
                            break;
                        case 4:
                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();
                            readService.showGradesForStudents(id);
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;

                case 3:
                    System.out.println("--- UPDATE SERVICE ---");
                    System.out.println("1. Update Student Phone Number");
                    System.out.println("2. Update Student Grade");
                    System.out.println("3. Update Course Description");
                    System.out.print("Enter choice: ");
                    int updateChoice = sc.nextInt();
                    switch (updateChoice) {
                        case 1:
                            updateService.updateStudentPhone();
                            break;
                        case 2:
                            updateService.updateStudentGrade();
                            break;
                        case 3:
                            updateService.updateCourseDescription();
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;

                case 4:
                    System.out.println("--- DELETE SERVICE ---");
                    System.out.println("1. Delete Specific Enrollment");
                    System.out.println("2. Delete Student and Enrollments");
                    System.out.println("3. Delete Course");
                    System.out.print("Enter choice: ");
                    int deleteChoice = sc.nextInt();
                    switch (deleteChoice) {
                        case 1:
                            deleteService.deleteEnrollmentById();
                            break;
                        case 2:
                            deleteService.deleteStudentById();
                            break;
                        case 3:
                            deleteService.deleteCourseById();
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Application. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid service choice");
            }
        }
    }
}
