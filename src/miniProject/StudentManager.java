package miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager extends AdminUser {
	
	private List<Students> studentList;
	
	

	
	 public StudentManager(){
		 studentList=new ArrayList<>();
	 }
	 //
	 public void addStudent(Students student) {
		 studentList.add(student);
		 System.out.println("Student added successfully");
	 }
	 // Method to print all student details
	    public void printAllStudents() {
	        if (studentList.isEmpty()) {
	            System.out.println("No students to display.");
	            return;
	        } 
	        System.out.println("All Student Details:");
	        for (Students student : studentList) {
	            student.printDetails(); // from Printable interface
	            System.out.println("---------------------------");
	        }
	    }
	    public void filterByGrade(int minMarks) {
	    	System.out.println("Students with grade >= " + minMarks + ":");

	    	 List<Students> filtered = studentList.stream()
	    		        .filter(s -> s.getGrade() >= minMarks)
	    		        .toList(); // Java 16+, for older versions use collect(Collectors.toList())

	    		    if (filtered.isEmpty()) {
	    		        System.out.println("No students found with grade >= " + minMarks);
	    		        return;
	    		    }

	    		    for (Students s : filtered) {
	    		        s.printDetails();                 // Print student details
	    		        System.out.println("---------------------"); // Line break between students
	    		    }
             }
	    public void addStudentFromInput() {
	        Scanner sc = new Scanner(System.in);
	        String choice;

	        do {
	            System.out.print("Enter student name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter age: ");
	            int age = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter student ID: ");
	            String id = sc.nextLine();

	            System.out.print("Enter Marks: ");
	            int Marks = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            // Create student and add to list
	            Students student = new Students(name, age, id, Marks);
	            addStudent(student);

	            // Ask if user wants to continue
	            System.out.print("Do you want to add another student? (yes/no): ");
	            choice = sc.nextLine();

	        } while (choice.equalsIgnoreCase("yes"));

	        System.out.println("Student entry completed!");
	    }

	    
}
