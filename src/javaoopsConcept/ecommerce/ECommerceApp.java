package javaoopsConcept.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javaoopsConcept.ecommerceproject.orders.Order;
import javaoopsConcept.ecommerceproject.payments.*;
import javaoopsConcept.ecommerceproject.products.*;

import javaoopsConcept.ecommerceproject.users.Customer;
import javaoopsConcept.ecommerceproject.utils.Discountable;
import javaoopsConcept.ecommerceproject.utils.OrderStorage;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Do you want to (1) place a new order or (2) view order history? ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline

        if (choice == 2) {
            OrderStorage.viewAllOrders();
            return;
        }

        // Customer input
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, email);

        // Product input
        List<Product> productList = new ArrayList<>();
        System.out.print("How many products to add? ");
        int productCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < productCount; i++) {
        	System.out.print("Enter product type (electronics/clothing/book/furniture): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.print("Enter product ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter product name: ");
            String pname = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter stock quantity: ");
            int stock=scanner.nextInt();
            
            scanner.nextLine(); // consume newline

            if (type.equals("electronics")) {
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter warranty in months: ");
                int warranty = scanner.nextInt();
                scanner.nextLine(); // consume newline
                productList.add(new Electronics(id, pname, price, brand, warranty,stock));
            } else if (type.equals("clothing")) {
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                System.out.print("Enter fabric: ");
                String fabric = scanner.nextLine();
                productList.add(new Clothing(id, pname, price, size, fabric,stock));
            }else if (type.equals("book")) {
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();
                productList.add(new Books(id, pname, price, author, genre,stock));
            } else if (type.equals("furniture")) {
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                System.out.print("Enter dimension (e.g., 6x3 ft): ");
                String dimension = scanner.nextLine();
                productList.add(new Furniture(id, pname, price, material, dimension,stock));
            }else {
                System.out.println("Invalid type. Skipping...");
            }
        }

        // Discount logic (10%)
        Discountable discount = (total) -> total;  // default no discount

        System.out.print("Enter discount percentage (0–25): ");
        double discountPercent = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        if (discountPercent >= 0 && discountPercent <= 25) {
            discount = (total) -> total * (1 - discountPercent / 100);
        } else {
            System.out.println("Discount not applicable. Must be between 0 and 25%.");
        }

        // Payment input
        System.out.print("Enter payment method (upi/card/cod): ");
        String paymentType = scanner.nextLine().toLowerCase();
        Payment payment = null;

        if (paymentType.equals("upi")) {
            System.out.print("Enter UPI ID: ");
            String upi = scanner.nextLine();
            payment = new UpiPayment(0, upi);
        } else if (paymentType.equals("card")) {
            System.out.print("Enter card number: ");
            String card = scanner.nextLine();
            payment = new CardPayment(0, card);
        }else if (paymentType.equals("cod")) {
            payment = new CashOnDelivery(0); 
        }else {
            System.out.println("Invalid payment method. Exiting.");
            return;
        }
        Order order = new Order(customer, productList);
        System.out.print("Do you want to cancel the order? (yes/no): ");
        String cancelChoice = scanner.nextLine().toLowerCase();

        if (cancelChoice.equals("yes")) {
            order.cancelOrder();
        } else {
            order.placeOrder(payment, discount);
        }

        scanner.close();
    }
}
