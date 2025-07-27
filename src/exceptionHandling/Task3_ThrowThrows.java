package exceptionHandling;

public class Task3_ThrowThrows {

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // Try changing this value
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

