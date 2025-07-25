package exceptionHandling;

interface TvRemoteControls{
	
	void turnon();
	
	default void batteryStatus() {
		System.out.println("battery is about to die");
	}
	
	static void info() {
		System.out.println("This is a Ai related remote control");
	}
}
class SmartTv implements TvRemoteControls{
	
	@Override
	public void turnon() {
		System.out.println("Tv is turn on");
	}
}

public class Task2_staticmethod {
	public static void main(String[] args) {
		
		SmartTv obj=new SmartTv();
		TvRemoteControls.info();
		obj.turnon();
		obj.batteryStatus();
	}

}
