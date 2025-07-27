package exceptionHandling.com.library.books;

public abstract class Book {
    protected String title;
    protected String author;
    protected String bookId;

    public Book(String title, String author, String bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    public abstract void displayInfo();
    public abstract boolean isAvailable();
    
    public String getBookId() {
        return bookId;
    }
}