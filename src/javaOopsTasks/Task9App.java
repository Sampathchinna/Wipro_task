package javaOopsTasks;

import service.StudentService;
import model.Student;

public class Task9App {
	
	public static void main(String[] args) {
		StudentService service=new StudentService();
		
		Student s1=new Student("sampath",20,89);
		
		service.saveStudent(s1);
		
		service.printStudents();
	}

}
