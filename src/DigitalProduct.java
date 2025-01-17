public class DigitalProduct extends Product {
    private final String downloadLink;

    public DigitalProduct(int id, String name, double price, String downloadLink) {
        super(id, name, price);
        this.downloadLink = downloadLink;
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Product Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Download Link: " + downloadLink);
    }
}
