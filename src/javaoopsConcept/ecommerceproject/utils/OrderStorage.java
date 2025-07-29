package javaoopsConcept.ecommerceproject.utils;


import javaoopsConcept.ecommerceproject.products.Product;
import javaoopsConcept.ecommerceproject.users.Customer;
//import javaoopsConcept.ecommerceproject.orders.Order;

import java.io.*;
import java.util.List;

public class OrderStorage {
    private static final String FILE_NAME = "orders.txt";

    public static void saveOrder(Customer customer, List<Product> products, double totalAmount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("Customer: " + customer.getName() + ", Email: " + customer.getEmail());
            writer.newLine();
            writer.write("Products:");
            writer.newLine();
            for (Product p : products) {
                writer.write(" - " + p.getName() + " | Rs" + p.getPrice());
                writer.newLine();
            }
            writer.write("Total Amount: ₹" + totalAmount);
            writer.newLine();
            writer.write("------------------------------");
            writer.newLine();
        } catch (IOException ex) {
            System.out.println("Error saving order: " + ex.getMessage());
        }
    }

    public static void viewAllOrders() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n Order History:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error reading order file: " + ex.getMessage());
        }
    }
}

