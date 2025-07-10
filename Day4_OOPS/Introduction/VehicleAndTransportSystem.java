package Day4_ProgrammingElements.Introduction;

class Vehicle{
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.fuelType = fuelType;
		this.maxSpeed = maxSpeed;
	}
	void displayInfo() {
		System.out.println("Max Speed: "+ maxSpeed);
		System.out.println("Fuel Type: "+ fuelType);
	}
}

class Car extends Vehicle{
	int seatCapacity;
	
	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity: "+ seatCapacity);
	}
}

class Truck extends Vehicle{
	int loadCapacity;
	
	Truck(int maxSpeed, String fuelType, int loadCapacity){
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Load Capacity: "+ loadCapacity);
	}
}

class MotorCycle extends Vehicle{
	boolean SideCar;
	
	MotorCycle(int maxSpeed, String fuelType, boolean SideCar){
		super(maxSpeed, fuelType);
		this.SideCar = SideCar;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity: "+ SideCar);
	}
}

public class VehicleAndTransportSystem {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car(180, "Petrol", 5);
		vehicles[1] = new Truck(120, "Diesel", 12);
		vehicles[2] = new MotorCycle(160, "Petrol", true);
		for(Vehicle v:vehicles) {
			v.displayInfo();
			System.out.println();
		}
	}

}
