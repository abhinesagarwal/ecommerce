import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
