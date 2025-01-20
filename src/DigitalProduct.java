public class DigitalProduct extends Product {
    private final String productLink;

    public DigitalProduct(int id, String name, double price, String productLink) {
        super(id, name, price);
        this.productLink = productLink;
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Product Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Download Link: " + productLink);
    }
}
