package exceptionHandling;

public class Task3_FInalVariableDemo {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("Value of PI: " + PI);

        // Uncommenting the below line will cause a compile-time error
        // PI = 3.14159;
    }
}

