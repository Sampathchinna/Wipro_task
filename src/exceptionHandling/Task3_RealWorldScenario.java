package exceptionHandling;

class AppConfig {
    public static final String APP_NAME = "Student Management System";
    public static final String VERSION = "1.0.0";
    public static final int MAX_USERS = 100;
}

public class Task3_RealWorldScenario {
    public static void main(String[] args) {
        System.out.println("Application: " + AppConfig.APP_NAME);
        System.out.println("Version: " + AppConfig.VERSION);
        System.out.println("Max Users Allowed: " + AppConfig.MAX_USERS);
    }
}

