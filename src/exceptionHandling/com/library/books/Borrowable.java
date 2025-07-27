package exceptionHandling.com.library.books;

public interface Borrowable {
    void borrowBook();

    default void returnPolicy() {
        System.out.println("Return within 14 days. Late return fee: ₹10/day.");
    }
}