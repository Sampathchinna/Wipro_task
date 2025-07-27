package exceptionHandling.com.library.users;

import exceptionHandling.com.library.books.FictionBook;

public class LibraryUser {
    private String name;
    private String userId;

    public LibraryUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public void borrow(FictionBook book) {
        System.out.println("\nUser: " + name);
        book.borrowBook();
        book.returnPolicy();
    }

    public void returnBook(FictionBook book, boolean late) {
        try {
            book.returnBook(late);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}