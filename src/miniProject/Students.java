package miniProject;

public class Students extends Person implements Printable  {
	
	private String Student_id;
	private double grade;
	
	public Students(String name,int age,String Student_id,double grade) {
		super(name,age);
		this.Student_id=Student_id;
		this.grade=grade;
	}

	public String getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(String student_id) {
		Student_id = student_id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student Name :"+getName());
		System.out.println("Age          :"+getAge());
		System.out.println("Student ID   :"+Student_id);
		System.out.println("Grade        :"+grade);
		
		
	}

	

}
