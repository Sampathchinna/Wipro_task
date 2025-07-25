package miniProject;

public class AdminUser extends User {

    public AdminUser(String username, String password) {
        super(username, password);  // Calling User class constructor
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals("admin") && this.password.equals("admin123");
    }

    public void displayWelcome() {
        System.out.println("Welcome, Admin!");
    }
}

