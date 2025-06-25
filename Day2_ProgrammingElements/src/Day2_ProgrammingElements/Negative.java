package Day2_ProgrammingElements;
import java.util.Scanner;
public class Negative {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;

	        while (true) {
	            int num = scanner.nextInt();

	            if (num <= 0) {
	                break;
	            }
	            sum += num;
	        }

	        System.out.println("Total sum: " + sum);
	    }
}

