package exceptionHandling;

public class Task4_MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20};
            int value = arr[2]; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of range!");
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero!");
        }
    }
    }


