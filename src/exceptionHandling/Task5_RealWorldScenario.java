package exceptionHandling;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}

class BankingApp {
    private double balance = 5000;

    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 1000) {
            throw new MinimumBalanceException("Minimum balance ₹1000 must be maintained.");
        }
        balance -= amount;
        System.out.println("Withdrawn Rs" + amount + " Remaining balance: Rs" + balance);
    }
}

public class Task5_RealWorldScenario {
    public static void main(String[] args) {
        BankingApp acc = new BankingApp();
        try {
            acc.withdraw(3500); 
        } catch (MinimumBalanceException ex) {
            System.out.println("Caught: " + ex.getMessage());
        }
    }
}

