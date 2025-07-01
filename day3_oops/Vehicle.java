package day3_oops;
class Vehicles {
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    static double registrationFee = 5000.0;

    public Vehicles(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayDetails() {
        if (this instanceof Vehicles) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        }
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles("Ayushi Verma", "Car", "MH12AB1234");
        Vehicles v2 = new Vehicles("Priya Sinha", "Bike", "DL5S1234");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
        System.out.println();

        Vehicles.updateRegistrationFee(5500.0);
        System.out.println("Registration Fee Updated!\n");

        v1.displayDetails();
    }
}
