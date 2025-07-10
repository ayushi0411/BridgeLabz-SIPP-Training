package Day4_ProgrammingElements.MultilevelInheritance;

class Order{
	String OrderId;
	String OrderDate;
	
	Order(String OrderId, String OrderDate){
		this.OrderDate = OrderDate;
		this.OrderId = OrderId;
	}
	
	void getOrderStatus() {
		System.out.println();
		System.out.println("Order Id: "+ OrderId);
		System.out.println("Order placed date: "+ OrderDate);
		
	}
}

class ShippedOrder extends Order{
      String trackingNumber;
      
      ShippedOrder(String OrderId, String OrderDate, String trackingNumber){
    	  super(OrderId, OrderDate);
    	  this.trackingNumber = trackingNumber;
      }
      
      void getOrderStatus() {
    	  super.getOrderStatus();
    	  System.out.println("Tracking Number: "+ trackingNumber);
      }
} 

class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	
	DeliveredOrder(String OrderId, String OrderDate, String trackingNumber, String deliveryDate){
		super(OrderId, OrderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	void getOrderStatus() {
		super.getOrderStatus();
  	  System.out.println("Delivered Date: "+ deliveryDate);
	}
}

public class OnlineRetailOrderManagement {

	public static void main(String[] args) {
		Order order = new Order("A123", "20-06-2025");
		ShippedOrder shippedorder = new ShippedOrder("A123", "20-06-2025", "Tk345");
		DeliveredOrder deliveredorder = new DeliveredOrder("A123", "20-06-2025", "Tk345", "22-06-2025");
		order.getOrderStatus();
		shippedorder.getOrderStatus();
		deliveredorder.getOrderStatus();

	}

}
