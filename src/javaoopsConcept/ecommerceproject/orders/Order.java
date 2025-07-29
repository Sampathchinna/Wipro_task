package javaoopsConcept.ecommerceproject.orders;

import java.util.List;
import javaoopsConcept.ecommerceproject.utils.OrderStorage;
import javaoopsConcept.ecommerceproject.users.Customer;
import javaoopsConcept.ecommerceproject.products.Product;
import javaoopsConcept.ecommerceproject.payments.Payment;
import javaoopsConcept.ecommerceproject.utils.Discountable;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Order is cancelled. Cannot proceed.");
            return;
        }

        // Step 1: Check stock
        for (Product p : products) {
            if (!p.isInStock()) {
                System.out.println("Product \"" + p.getName() + "\" is out of stock. Cannot place order.");
                return;
            }
        }

        // Step 2: Display customer and product details
        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        // Step 3: Apply discount
        double discountedAmount = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discountedAmount);

        // Step 4: Process payment
        payment.setAmount(discountedAmount);
        payment.processPayment();

        // Step 5: Reduce stock
        products.forEach(Product::reduceStock);
        
        OrderStorage.saveOrder(customer, products, discountedAmount);
        
    }

    public void cancelOrder() {
        this.isCancelled = true;
        System.out.println("Order has been cancelled.");
    }

    public boolean isCancelled() {
        return isCancelled;
    }
}
