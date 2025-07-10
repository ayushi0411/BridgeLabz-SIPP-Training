package Day6_ProgrammingElement;
abstract class Vehicle{
	private String VehicleId;
	private String driverName;
	private double ratePerKm;
	private String currentLocation;
	
	Vehicle(String VehicleId, String driverName, double ratePerKm){
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
		this.VehicleId = VehicleId;
	}
	public String getDriverName() {
		return driverName;
	}
	
	public String getVehicelId() {
		return VehicleId;
	}
	
	public double getRatePerKm() {
		return ratePerKm;
	}
	
	protected String getCurrentLocationField() {
        return currentLocation;
    }
	
	protected void setCurrentLocationField(String location) {
        this.currentLocation = location;
    }
	
	public abstract double calculateFare(double distance);
	void getVehicleDetails() {
		System.out.println("Vehicle id: "+ VehicleId);
		System.out.println("Driver Name: "+ driverName);
		System.out.println("Rate per km : "+ ratePerKm);
	}
	
}

interface GPS{
	String getCurrentLocation();
	void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance + 50; // Add base charge
        System.out.println("Car Fare for " + distance + " km: $" + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationField();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationField(newLocation);
        System.out.println("Car location updated to: " + newLocation);
    }
}

// Bike subclass
class Bike extends Vehicle implements GPS {

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance; // No base charge for bike
        System.out.println("Bike Fare for " + distance + " km: $" + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationField();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationField(newLocation);
        System.out.println("Bike location updated to: " + newLocation);
    }
}

// Auto subclass
class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance + 20; // Small base charge for auto
        System.out.println("Auto Fare for " + distance + " km: $" + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationField();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationField(newLocation);
        System.out.println("Auto location updated to: " + newLocation);
    }
}

public class RideHailingApplication {
	public static void processRide(Vehicle vehicle, double distance) {
		vehicle.getVehicleDetails();
	    vehicle.calculateFare(distance);
	    System.out.println();
	}
    
	public static void main(String[] args) {
	     Vehicle car = new Car("defrg435v", "Ayeashs", 15);
	     Vehicle bike = new Bike("ertvg45", "ecvrtb", 7);
	     Vehicle auto = new Auto("435tg", "Chaedrgth", 10);

	     GPS carGPS = (GPS) car;
	     carGPS.updateLocation("Downtown");
	     GPS bikeGPS = (GPS) bike;
	     bikeGPS.updateLocation("City Square");
	     GPS autoGPS = (GPS) auto;
	     autoGPS.updateLocation("Bus Station");

	     processRide(car, 10);   
	     processRide(bike, 5);   
	     processRide(auto, 8);  
	}
}
