package Day6_ProgrammingElement;



abstract class FoodItem{
	private String itemName;
	private double price;
	private int quantity;
	private double discountApplied = 0.0;
	FoodItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getDiscountApplied() {
	        return discountApplied;
	}
	protected void setDiscountApplied(double discountApplied) {
        this.discountApplied = discountApplied;
    }
	public abstract double calculateTotalPrice();
	void getItemDetails() {
		System.out.println("Item Name: "+ itemName);
		System.out.println("Price: "+ price);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Discount Applied: " + discountApplied + "%");
	}
}

interface Discountable{
	void applyDiscount(double percent);
	String getDiscountDetails();
}

class Veg extends FoodItem implements Discountable{
	private static final double VegCharge= 20.0;
	Veg(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	@Override
	public void applyDiscount(double percent) {
		if (percent >= 0 && percent <= 30) { 
            setDiscountApplied(percent);
            System.out.println("Discount of " + percent + "% applied on VegItem.");
        } else {
            System.out.println("Invalid discount percent for VegItem.");
        }
	}

	@Override
	public String getDiscountDetails() {
		return "VegItem discount: " + getDiscountApplied() + "%";
	}

	@Override
	public double calculateTotalPrice() {
		double total = (getPrice() * getQuantity()) + VegCharge;
        total -= total * (getDiscountApplied() / 100);
        return total;
	}
}

class NonVeg extends FoodItem implements Discountable{
	private static final double NonVegCharge= 20.0;
	NonVeg(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	@Override
	public void applyDiscount(double percent) {
		if (percent >= 0 && percent <= 30) { 
            setDiscountApplied(percent);
            System.out.println("Discount of " + percent + "% applied on NonVegItem.");
        } else {
            System.out.println("Invalid discount percent for NonVegItem.");
        }
	}

	@Override
	public String getDiscountDetails() {
		return "NonVegItem discount: " + getDiscountApplied() + "%";
	}

	@Override
	public double calculateTotalPrice() {
		double total = (getPrice() * getQuantity()) + NonVegCharge;
        total -= total * (getDiscountApplied() / 100);
        return total;
	}
}
public class OnlineFoodDeliverySystem {
	
	public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        System.out.println("Total price after charges & discount: Rs." + total);
        System.out.println();
    }

	public static void main(String[] args) {
		FoodItem f1 = new Veg("Burger", 400.0, 2);
		FoodItem f2 = new NonVeg("Chicken", 1000.0, 1);
		Discountable vegDiscount = (Discountable) f1;
	    vegDiscount.applyDiscount(10);

	    Discountable nonVegDiscount = (Discountable) f2;
	    nonVegDiscount.applyDiscount(20);
	    
	    processOrder(f1);
        processOrder(f2);
	}

}
