package Level1;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000.0;

    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Ayushi", "Honda City", 4);

        System.out.println("Default Rental:");
        defaultRental.displayDetails();

        System.out.println("\nCustom Rental:");
        customRental.displayDetails();
    }
}
