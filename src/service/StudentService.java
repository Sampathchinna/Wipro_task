package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentService {
	
	private List<Student> students=new ArrayList<>();
	
	//method to save a student
	public void saveStudent(Student student) {
		students.add(student);
		System.out.println("Student saved Succesfully");
	}
	//method to print all students
	public void printStudents() {
		if(students.isEmpty()) {
			System.out.println("no students");
			return;
		}
		System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Grade: " + s.getMarks());
            System.out.println("--------------------------");
        }
	}

}
