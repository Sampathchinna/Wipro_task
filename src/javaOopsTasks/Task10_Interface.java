package javaOopsTasks;

interface Logger{
	
	default void loginInfo() {
		System.out.println("default interface method");
	}
	static void logError() {
		System.out.println("static logger");
	}
}

public class Task10_Interface implements Logger {
	public static void main(String[] args) {
		Task10_Interface logger=new Task10_Interface();
		logger.loginInfo();
		
		Logger.logError();
	}

}
