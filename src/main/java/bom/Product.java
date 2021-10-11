package bom;

public abstract class Product {
    public String id;

    public Product(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //abstract method of getPrice
    public abstract double getPrice();
}
