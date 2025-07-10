package Day6_ProgrammingElement;
import java.util.*;

abstract class Product{
	String productId;
	String name;
	double price;
	
	Product(String productId, String name, double price){
		this.price = price;
		this.productId = productId;
		this.name = name;
	}
	
	public String getproductId() {
		return productId;
	}
	
	public void setproductId(String productId) {
		this.productId = productId;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name= name;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public abstract double calculateDiscount();
}

interface Taxable{
	double calculateTax();
	String getTaxDetails();
}

class Electronics extends Product implements Taxable{

	Electronics(String productId, String name, double price) {
		super(productId, name, price);
		
	}

	@Override
	public double calculateTax() {
		return getprice()*0.18;
	}

	@Override
	public String getTaxDetails() {
		return "18% GST applied on products";
	}

	@Override
	public double calculateDiscount() {
		return getprice()*0.20;
	}
}

class Clothing extends Product implements Taxable{

	Clothing(String productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateTax() {
		return getprice()*0.18;
	}

	@Override
	public String getTaxDetails() {
		return "18% GST applied on products";
	}

	@Override
	public double calculateDiscount() {
		return getprice()*0.20;
	}
}

class Groceries extends Product{

	Groceries(String productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}
public class ECommercePlatform {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Electronics("ER34", "MobilePhone", 10000));
		products.add(new Clothing("C344", "T-shirt", 500));
		products.add(new Groceries("GR342", "Vegetables", 200));
		for(Product p : products) {
			double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getprice() + tax - discount;

            System.out.println(p.getname() + " Final Price: Rs." + finalPrice);
		}

	}

}
