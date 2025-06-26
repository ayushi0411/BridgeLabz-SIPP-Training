package Day2_ProgrammingElements;
import java.util.Scanner;

public class EmployeesBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}

