package javaoopsConcept.ecommerceproject.payments;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        String last4Digits = cardNumber.length() >= 4
                ? cardNumber.substring(cardNumber.length() - 4)
                : cardNumber;
        System.out.println("Paid Rs" + amount + " using Card ending with: " + last4Digits);
    }
}
