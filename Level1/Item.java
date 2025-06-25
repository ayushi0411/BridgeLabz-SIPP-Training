package Level1;

public class Item {
	private String itemCode;
	private String itemName;
	private double price;

	public Item(String itemCode, String itemName, double price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Item Code : " + itemCode);
		System.out.println("Item Name : " + itemName);
		System.out.println("Price     : $" + price);
	}

	public double calculateTotalCost(int quantity) {
		return price * quantity;
	}

	public static void main(String[] args) {
		Item item = new Item("A101", "Notebook", 25.50);
		item.displayDetails();
		int quantity = 4;
		double totalCost = item.calculateTotalCost(quantity);
		System.out.println("Quantity  : " + quantity);
		System.out.println("Total Cost: $" + totalCost);
	}
}
