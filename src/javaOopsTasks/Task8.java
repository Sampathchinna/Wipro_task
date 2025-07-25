package javaOopsTasks;

//abstract class
abstract class Appliance{
	abstract void turnon();
}

//Interface
interface Connectable{
	void connect();
}

class Smarttv extends Appliance implements Connectable{
	
	@Override
	void turnon() {
		System.out.println("SmartTv is now On.");
	}
	
	@Override
	public void connect() {
		System.out.println("Smart Tv is connected to ScreenSharing");
	}
}
public class Task8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smarttv tv=new Smarttv();
		tv.turnon();
		tv.connect();

	}

}
