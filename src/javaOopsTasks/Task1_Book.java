package javaOopsTasks;

public class Task1_Book {
	String title;
	String author;
	double price;
	
	void displayDetails() {
		System.out.println("title:"+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
	}
	public static void main(String[] args) {
		Task1_Book book=new Task1_Book();
		book.title="HeisenBerg";
		book.author="Sampath";
		book.displayDetails();
	}

}
