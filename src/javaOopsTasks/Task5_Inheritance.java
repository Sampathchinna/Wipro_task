package javaOopsTasks;

class Vehicle{
	String brand;
	String speed;
	
	void showDetails() {
		System.out.println("Brnad is: "+brand);
		System.out.println("speed is: "+speed);
	}
}

class car extends Vehicle{
	
	void showDetails() {
		System.out.println("This is a car");
		super.showDetails();
	}	
}

class bike extends Vehicle{
	
	void showDetails() {
		System.out.println("This is a bike");
		super.showDetails();
	}
}

public class Task5_Inheritance {
	
	public static void main(String[] args) {
		car car=new car();
		car.brand="fortuner";
		car.speed="20kmh";
		car.showDetails();
	}
}
