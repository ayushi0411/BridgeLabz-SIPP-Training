package Day1_Programs;
import java.util.Scanner;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeName = "";
        int price = 0;

        while (true) {
            System.out.println("\nHello! Welcome to our cafe");
            System.out.println("Choose a coffee Type:");
            System.out.println("1. Espresso - ₹180");
            System.out.println("2. Americano - ₹150");
            System.out.println("3. Latte - ₹170");
            System.out.println("4. Hot Coffee - ₹120");
            System.out.println("Enter your Choice (1-4) or 0 to Exit:");

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Thank you! Visit again.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            switch (choice) {
                case 1:
                    price = 180;
                    coffeeName = "Espresso";
                    break;
                case 2:
                    price = 150;
                    coffeeName = "Americano";
                    break;
                case 3:
                    price = 170;
                    coffeeName = "Latte";
                    break;
                case 4:
                    price = 120;
                    coffeeName = "Hot Coffee";
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
                    continue;
            }

            int total = price * quantity;
            double gst = total * 0.18;
            double finalBill = total + gst;

            System.out.println("\n---- Bill Summary ----");
            System.out.println("Coffee: " + coffeeName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: ₹" + total);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Final Amount: ₹" + finalBill);
            System.out.println("-----------------------\n");
        }

        sc.close();
    }
}

