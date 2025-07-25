package javaOopsTasks;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	BankAccount(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}else {
			System.out.println("Deposit amount be positive");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn: "+amount);
		}else {
			System.out.println("in sufficient balance");
		}
	}
	
	public double getBalance() {
		return balance;
	}

}
