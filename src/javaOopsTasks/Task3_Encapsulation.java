package javaOopsTasks;

public class Task3_Encapsulation {
	
	public static void main(String[] args) {
		BankAccount account=new BankAccount(12345,500.0);
		
		account.deposit(400);
		System.out.println(account.getBalance());
		
		account.withdraw(600);
		System.out.println(account.getBalance());
	}

}
