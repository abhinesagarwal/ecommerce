public class Main {
    public static void main(String[] args) {
        // Create a digital product
        DigitalProduct digitalProduct = new DigitalProduct(1, "vitamins", 999, "https://demo.com/");

        // Create a customer
        Customer customer = new Customer(1, "Abhinesh");

        // Create an order
        Order order = new Order(1, customer);

        // Add the digital product to the order
        order.addProduct(digitalProduct);

        // Display the order details
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer Name: " + order.getCustomer().getName());
        System.out.println("Product Details:");
        digitalProduct.displayDetails();
    }
}
