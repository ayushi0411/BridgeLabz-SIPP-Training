package Day6_ProgrammingElement;

interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}

abstract class Vehicle implements Insurable{
	String vehicleNumber;
	String type;
	double rentalRate;
	String insurancePolicyNumber;
	
	Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber){
		this.rentalRate = rentalRate;
		this.type = type;
		this.vehicleNumber= vehicleNumber;
		this.insurancePolicyNumber=insurancePolicyNumber;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public double getRentalRate() {
		return rentalRate;
	}
	
	protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
	public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable{

	Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, type, rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateInsurance() {
		return getRentalRate() * 0.1;
	}

	@Override
	public String getInsuranceDetails() {
		return "Car Insurance Policy: " + getInsurancePolicyNumber();
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	
}

class Bike extends Vehicle implements Insurable{

	Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, type, rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateInsurance() {
		return getRentalRate() * 0.1;
	}

	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance Policy: " + getInsurancePolicyNumber();
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}	
}

class Truck extends Vehicle implements Insurable {

	Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, type, rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateInsurance() {
		return getRentalRate() * 0.1;
	}

	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance Policy: " + getInsurancePolicyNumber();
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
}
public class VehicleRentalSystem {

	public static void main(String[] args) {
		Vehicle car = new Car("AB34456", "Car", 1500.0, "CAR-0987654");
		Vehicle bike = new Bike("DF45678", "Bike", 800.0, "BK-345678");
		Vehicle truck = new Truck("TK7654", "Truck", 2000.0, "TK-56789");
		Vehicle[] vehicles = {car, bike, truck};
		int rentalDays = 2;
		for(Vehicle v : vehicles) {
			System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost: " + v.calculateInsurance());
            System.out.println("Insurance Details: " + v.getInsuranceDetails());
            System.out.println();
		}
	}

}
