package javaOops.miniProject;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
        AdminUser admin = new AdminUser();

        //Perform login
        if (!admin.login()) {
            System.out.println("Access denied. Exiting...");
            return;
        }

        //Login successful
        admin.displayWelcome();

        //Begin Student Management
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("--------------------------");
            System.out.println("1.Add Student");
            System.out.println("2.Display All Students");
            System.out.println("3.Filter Students by Grade");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manager.addStudentFromInput();
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    System.out.print("Enter minimum grade to filter: ");
                    int minGrade = sc.nextInt();
                    sc.nextLine();
                    manager.filterByGrade(minGrade);
                    break;
                case 4:
                    System.out.println("Logged out. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}