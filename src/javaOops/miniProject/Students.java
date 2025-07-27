package javaOops.miniProject;

public class Students extends Person implements Printable  {
	
	private String Student_id;
	private double Marks;
	
	public Students(String name,int age,String Student_id,int Marks) {
		super(name,age);
		this.Student_id=Student_id;
		this.Marks=Marks;
	}

	public String getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(String student_id) {
		Student_id = student_id;
	}

	public double getGrade() {
		return Marks;
	}

	public void setGrade(char grade) {
		this.Marks = grade;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student Name :"+getName());
		System.out.println("Age          :"+getAge());
		System.out.println("Student ID   :"+Student_id);
		System.out.println("Grade        :"+Marks);
		
		
	}

	

}
