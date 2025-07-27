package exceptionHandling.com.library.books;


public class FictionBook extends Book implements Borrowable {
    private boolean available;

    public FictionBook(String title, String author, String bookId) {
        super(title, author, bookId);
        this.available = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (available ? "Available" : "Borrowed"));
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrowBook() {
        if (!available) {
            System.out.println("Book already borrowed.");
        } else {
            available = false;
            System.out.println("Book borrowed successfully!");
        }
    }

    public void returnBook(boolean late) throws Exception {
        available = true;
        if (late) {
            throw new Exception("Book returned late. Pay fine.");
        }
        System.out.println("Book returned successfully!");
    }
}