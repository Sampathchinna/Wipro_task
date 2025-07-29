package multiThreading;

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount, String name) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println(name + " tried to withdraw but insufficient balance!");
        }
    }
}

public class Task8_BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable r = () -> account.withdraw(700, Thread.currentThread().getName());

        Thread t1 = new Thread(r, "User1");
        Thread t2 = new Thread(r, "User2");

        t1.start();
        t2.start();
    }
}

