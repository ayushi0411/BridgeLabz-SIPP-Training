package Day5_ProgrammingElements.Level1;
import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("- " + name + " - "+ price );
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customerss {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customerss(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    void showOrders() {
        System.out.println(name + " Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommercePlatform{
    public static void main(String[] args) {
        Customerss customer = new Customerss("Ayesha");

        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Charger", 45.00);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.showOrders();
    }
}
