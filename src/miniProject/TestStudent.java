package miniProject;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for credentials at runtime
        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        // Step 2: Create AdminUser object using entered values
        AdminUser admin = new AdminUser(inputUsername, inputPassword);

        // Step 3: Check login
        if (admin.login(inputUsername, inputPassword)) {
            admin.displayWelcome();
        } else {
            System.out.println("Login failed. Try again.");
        }

        sc.close();
    }
}
