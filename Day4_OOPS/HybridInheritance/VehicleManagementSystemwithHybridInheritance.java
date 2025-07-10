package Day4_ProgrammingElements.HybridInheritance;
class Vehicle{
	int maxSpeed;
	String model;
	
	Vehicle(String model, int maxSpeed){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	void displayInfo() {
		
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable{
	void refuel();
}

class ElectricVehicle extends Vehicle {
	int batteryCapacity; 

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    
    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
        System.out.println();
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; 

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + fuelTankCapacity + " liters");
    }
}
public class VehicleManagementSystemwithHybridInheritance {

	public static void main(String[] args) {
		ElectricVehicle swift = new ElectricVehicle("Swift Model 3", 250, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220, 50);

        System.out.println("--- Electric Vehicle ---");
        swift.displayInfo();
        swift.charge();

        System.out.println("--- Petrol Vehicle ---");
        honda.displayInfo();
        honda.refuel();

	}

}
