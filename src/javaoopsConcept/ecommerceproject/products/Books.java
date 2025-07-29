package javaoopsConcept.ecommerceproject.products;

public class Books extends Product {
    private String author;
    private String genre;

    public Books(String id, String name, double price, String author, String genre,int stockQuantity) {
        super(id, name, price,stockQuantity);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author +
                           " | Genre: " + genre + " | Price: Rs" + price +" |stock:"+stockQuantity);
    }
}
