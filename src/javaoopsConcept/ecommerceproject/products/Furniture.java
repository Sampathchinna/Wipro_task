package javaoopsConcept.ecommerceproject.products;

public class Furniture extends Product {
    private String material;
    private String dimension;

    public Furniture(String id, String name, double price, String material, String dimension,int stockQuantity) {
        super(id, name, price,stockQuantity);
        this.material = material;
        this.dimension = dimension;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Material: " + material +
                           " | Dimension: " + dimension + " | Price: Rs" + price +" |stock:"+stockQuantity);
    }
}
