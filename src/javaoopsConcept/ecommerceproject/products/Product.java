package javaoopsConcept.ecommerceproject.products;

public abstract class Product {
	protected String id;
	protected String name;
	protected double price;
	protected int stockQuantity;
	
	public Product(String id, String name,double price,int stockQuantity) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
	public abstract void displayDetails();
	
	public double getPrice() {
		return price;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStockQuantity() {
        return stockQuantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public void reduceStock() {
        if (stockQuantity > 0) {
            stockQuantity--;
        }
    }
}


