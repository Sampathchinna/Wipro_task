package javaoopsConcept.ecommerceproject.products;

public class Electronics extends Product {
	private String brand;
	private int WarrantyInMonths;

	public Electronics(String id, String name, double price,String brand,int WarrantyInMonths,int stockQuantity ) {
		super(id, name, price,stockQuantity);
		this.brand=brand;
		this.WarrantyInMonths=WarrantyInMonths;	
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Electronics: " + name + " | Brand: " + brand + 
                " | Warranty: " + WarrantyInMonths + " months | Price: " + price +" |stock:"+stockQuantity);
	}

}
