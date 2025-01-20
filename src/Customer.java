public class Customer {
    private int id;
    private String name;
    private Cart cart;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new Cart();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }
}