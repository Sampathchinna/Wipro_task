package javaoopsConcept.ecommerceproject.payments;

public abstract class Payment{
	protected double amount;
	
	public Payment(double amount) {
		this.amount=amount;
	}
	
	public abstract void processPayment();
	
	public void setAmount(double amount) {
		this.amount=amount;
	}

}
