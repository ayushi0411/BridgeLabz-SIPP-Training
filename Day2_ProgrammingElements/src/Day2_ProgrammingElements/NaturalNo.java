package Day2_ProgrammingElements;
import java.util.Scanner;

public class NaturalNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!in.hasNextInt()) {
            System.out.println("The number is not a natural number");
            return;
        }
        int n = in.nextInt();
        
        if (n >= 0) {  
            long sum = (long) n * (n + 1) / 2;  
            System.out.println("If the number is a positive integer then the output is");
            System.out.printf("The sum of %d natural numbers is %d%n", n, sum);
        } else {
            System.out.printf("The number %d is not a natural number%n", n);
        }
    }
}

