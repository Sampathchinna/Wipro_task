package javaoopsConcept.ecommerceproject.payments;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Order will be paid via Cash on Delivery (Amount Rs" + amount + ")");
    }
}
