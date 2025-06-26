package Day4_ProgrammingElement;
import java.util.Scanner;
public class SimpleInterest {
	    public static double calculateSimpleInterest(double p, double r, double t) {
	        return (p * r * t) / 100;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double p = sc.nextDouble();
	        double r = sc.nextDouble();
	        double t = sc.nextDouble();
	        sc.close();

	        double si = calculateSimpleInterest(p, r, t);
	        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
	                           si, p, r, t);
	    }
}
