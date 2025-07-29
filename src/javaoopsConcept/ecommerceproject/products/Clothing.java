package javaoopsConcept.ecommerceproject.products;

public class Clothing extends Product {
	private String size;
	private String fabric;

	public Clothing(String id, String name, double price,String size,String fabric,int stockQuantity){
		super(id, name, price,stockQuantity);
		this.size=size;
		this.fabric=fabric;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Clothing: " + name + " | Size: " + size + 
                " | Fabric: " + fabric + " | Price: Rs" + price+" |stock:"+stockQuantity);
		
	}
		
		
	

}
