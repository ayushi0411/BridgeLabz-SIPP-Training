package Level2;
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                removed = true;
                System.out.println(itemName + " removed from cart.");
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 120.0, 2);
        cart.addItem("Pen", 10.0, 5);
        cart.displayTotalCost();
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}
