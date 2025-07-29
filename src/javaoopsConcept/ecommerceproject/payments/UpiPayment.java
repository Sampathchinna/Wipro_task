package javaoopsConcept.ecommerceproject.payments;

public class UpiPayment extends Payment {
	private String UpiId;

	public UpiPayment(double amount,String UpiId) {
		super(amount);
		setUpiId(UpiId);  // validate on set
    }

    private void setUpiId(String upiId) {
        if (isValidUpi(upiId)) {
            this.UpiId = upiId;
        } else {
            throw new IllegalArgumentException("Invalid UPI ID format: " + upiId);
        }
    }

    private boolean isValidUpi(String upiId) {
        return upiId.matches("^[\\w.-]+@(?:upi|ybl|ibl|okaxis|oksbi)$");
    }
	
	
	public void processPayment() {
		System.out.println("paid Rs"+amount+"via UPI:"+UpiId);
	}

}
