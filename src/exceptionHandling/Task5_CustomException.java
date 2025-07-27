package exceptionHandling;

class InvalidAccountException extends Exception {
    public InvalidAccountException(String msg) {
        super(msg);
    }
}

public class Task5_CustomException {
    public static void main(String[] args) {
        double balance = -500;
        try {
            if (balance < 0) {
                throw new InvalidAccountException("Account balance cannot be negative!");
            }
        } catch (InvalidAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

