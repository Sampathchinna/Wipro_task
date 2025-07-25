package exceptionHandling;

interface RemoteControl{
	
	//abstract method
	void turnon();
	
	default void batteryStatus() {
		System.out.println("battery is charging");
	}	
}

class Tv implements RemoteControl{
	
	@Override
	public void turnon() {
		System.out.println("The tv is turn on");
	}
}

public class Task2_interface {
	public static void main(String[] args) {
		Tv obj=new Tv();
		obj.turnon();
		obj.batteryStatus();
	}

}
