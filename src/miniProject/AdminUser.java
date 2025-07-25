package miniProject;

import java.util.Scanner;

public class AdminUser extends User {

    public AdminUser() {
        super("admin", "admin123");  // Set correct login credentials here
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }

    public void displayWelcome() {
        System.out.println("Welcome, Admin!");
    }
}
