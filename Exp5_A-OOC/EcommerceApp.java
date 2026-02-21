class Product {
    String name;
    double price;
    Product(String n, double p) {
        name = n;
        price = p;
    }
    void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}
class Customer {
    String name;

    Customer(String n) {
        name = n;
    }
    void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}
class Order {
    void placeOrder(Product p, Customer c) {
        c.displayCustomer();
        p.displayProduct();
        System.out.println("Total Cost: " + p.price);
    }
}
public class EcommerceApp {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 53000);
        Customer c = new Customer("Nilam");
        Order o = new Order();
        o.placeOrder(p, c);
    }
}
