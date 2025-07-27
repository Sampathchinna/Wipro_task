package exceptionHandling.com.library.users;

import java.util.*;
import exceptionHandling.com.library.books.FictionBook;
import exceptionHandling.com.library.books.LibraryConstants;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FictionBook> books = new ArrayList<>();
        System.out.println("Welcome to " + LibraryConstants.LIBRARY_NAME);
        System.out.println("Address: " + LibraryConstants.LIBRARY_ADDRESS);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your User ID: ");
        String userId = sc.nextLine();
        LibraryUser user = new LibraryUser(name, userId);

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine();
                    books.add(new FictionBook(title, author, bookId));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    String bid = sc.nextLine();
                    FictionBook toBorrow = findBookById(books, bid);
                    if (toBorrow != null) {
                        user.borrow(toBorrow);
                    } else {
                        System.out.println("❌ Book ID not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = sc.nextLine();
                    FictionBook toReturn = findBookById(books, returnId);
                    if (toReturn != null) {
                        System.out.print("Is return late? (yes/no): ");
                        String isLate = sc.nextLine();
                        boolean late = isLate.equalsIgnoreCase("yes");
                        user.returnBook(toReturn, late);
                    } else {
                        System.out.println("Book ID not found!");
                    }
                    break;

                case 4:
                    System.out.println("\nBook List:");
                    for (FictionBook book : books) {
                        book.displayInfo();
                        System.out.println("-----------------");
                    }
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("❗ Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }

    public static FictionBook findBookById(List<FictionBook> books, String id) {
        for (FictionBook book : books) {
            if (book.getBookId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }
}

