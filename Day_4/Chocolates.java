package Day4_ProgrammingElement;
import java.util.Scanner;
public class Chocolates {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	          System.out.print("Enter total chocolates (dividend): ");
	          int total = sc.nextInt();

	          System.out.print("Enter number of children (divisor): ");
	          int children = sc.nextInt();

	          int quotient = total / children;
	          int remainder = total % children;

	          System.out.println("Each child gets: " + quotient + " chocolates");
	          System.out.println("Remaining chocolates: " + remainder);

	          sc.close();
	      }

  }
