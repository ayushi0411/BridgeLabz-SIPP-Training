package day3_oops;
class Products {
    final int productID;
    String productName;
    double price;
    int quantity;

    static double discount = 10.0;

    public Products(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        if (this instanceof Products) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        }
    }
}

public class Product {
    public static void main(String[] args) {
        Products p1 = new Products(101, "Laptop", 50000, 1);
        Products p2 = new Products(102, "Headphones", 1500, 2);

        p1.displayProduct();
        System.out.println();
        p2.displayProduct();
        System.out.println();

        Products.updateDiscount(15.0);
        System.out.println("Discount updated to: " + Products.discount + "%\n");

        p1.displayProduct();
    }
}

