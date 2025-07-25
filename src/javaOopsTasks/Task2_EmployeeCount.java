package javaOopsTasks;

public class Task2_EmployeeCount {
	
	static int count=0;
	
	Task2_EmployeeCount(){
		count++;
	}
	
	public static void main(String[] args) {
		Task2_EmployeeCount employee=new Task2_EmployeeCount();
		Task2_EmployeeCount employee1=new Task2_EmployeeCount();
		Task2_EmployeeCount employee2=new Task2_EmployeeCount();
		System.out.println(count);
	}

}
