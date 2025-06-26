package Day4_ProgrammingElement;
import java.util.Scanner;
public class TiangleRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        int rounds = calculateRounds(a, b, c);
        System.out.printf("You need %d round%s to complete a 5 km run.%n",
                          rounds, rounds > 1 ? "s" : "");
    }
}

