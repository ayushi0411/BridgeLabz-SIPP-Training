package InstancevsClassVariablesandMethods;
public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ayushi", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...\n");
        Vehicle.updateRegistrationFee(6000.0);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
