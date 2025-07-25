package exceptionHandling;

abstract class PaymentMethod {
    abstract void pay(double amount); // Abstract method
}

class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Cash extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash");
    }
}

public class Task1_RealWorldScenario {
    public static void main(String[] args) {
        

    	PaymentMethod method = new CreditCard();
        method.pay(1500.00);

        PaymentMethod method1 = new UPI();
        method1.pay(750.50);

        PaymentMethod method2 = new Cash();
        method2.pay(300.00);
    }
}

