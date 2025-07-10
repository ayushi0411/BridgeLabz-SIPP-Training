package Day5_ProgrammingElements.Level2;
import java.util.*;

class Product {
    String name;
    double quantity; 
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    List<Product> products;

    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }
}

class BillGenerator {
    double generateBill(Customer customer) {
        double total = 0.0;
        for (Product product : customer.products) {
            total += product.getTotalPrice();
        }
        return total;
    }
}


public class GroceryStoreApp {
 public static void main(String[] args) {
    
     Product apples = new Product("Apples", 2.0, 3.0); 
     Product milk = new Product("Milk", 1.0, 2.0);     
    
     Customer alice = new Customer("Alice");
     alice.addProduct(apples);
     alice.addProduct(milk);

     BillGenerator billGen = new BillGenerator();

     double totalBill = billGen.generateBill(alice);

     System.out.println(alice.name + "'s Total Bill: " + totalBill);
 }
}

