package javaoopsConcept.ecommerceproject.users;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        setEmail(email);
    }
    
    public void setEmail(String email) {
    	if(isValidEmail(email)) {
    		this.email=email;
    	}else {
    		throw new IllegalArgumentException("Invalid email format: " + email);
    	}
    }
    
    private boolean isValidEmail(String email) {
    	  return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " | Email: " + email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
