package wrapperclass;

public class Task8_BankAccount {
	
	private String accountNumber;
	private Double balance;//using wrapper class
	
	Task8_BankAccount(String accountNumber,Double balance) {
		this.accountNumber=accountNumber;
		
		if(balance==null) {
			this.balance=0.0;
		}else {
			this.balance=balance;
		}
			
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited:"+amount);
	}
	
	public void withDraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}else {
			balance-=amount;
			System.out.println("Withdrawn:"+amount);
		}
	}
	public void showBalance() {
		System.out.println("Account: "+accountNumber +", balance: "+balance);
	}
	
	public static void main(String[] args) {
		Task8_BankAccount acc1=new Task8_BankAccount("1234",null);
		acc1.showBalance();
		
		acc1.deposit(5000);
		acc1.withDraw(2000);
		acc1.showBalance();
	}
	

}
