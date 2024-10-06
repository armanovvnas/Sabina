class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product original = new Product("Laptop", 1000);
        Product copy = (Product) original.clone();
        copy.setPrice(1200);

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
    }
}
