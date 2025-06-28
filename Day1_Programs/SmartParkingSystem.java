package Day1_Programs;
import java.util.Scanner;
public class SmartParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] slots = new String[3];
        boolean running = true;

        while (running) {
            System.out.println("\n--- Smart Parking Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Parking Slots");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicle = sc.nextLine();
                    boolean parked = false;
                    for (int i = 0; i < slots.length; i++) {
                        if (slots[i] == null) {
                            slots[i] = vehicle;
                            System.out.println("Vehicle parked in Slot " + (i + 1));
                            parked = true;
                            break;
                        }
                    }
                    if (!parked) {
                        System.out.println("All slots are full.");
                    }
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String remove = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < slots.length; i++) {
                        if (remove.equals(slots[i])) {
                            slots[i] = null;
                            System.out.println("Vehicle removed from Slot " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    System.out.println("--- Parking Slots ---");
                    for (int i = 0; i < slots.length; i++) {
                        if (slots[i] == null) {
                            System.out.println("Slot " + (i + 1) + ": Empty");
                        } else {
                            System.out.println("Slot " + (i + 1) + ": " + slots[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You! Drive Safely...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
