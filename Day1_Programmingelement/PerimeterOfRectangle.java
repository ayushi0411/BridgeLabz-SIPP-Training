package Day1_ProgrammingElements;
import java.util.Scanner;
public class PerimeterOfRectangle {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	        double perimeter = 2 * (length + width); 
	        System.out.println("Perimeter of the rectangle is: " + perimeter);

	        double area = length * width;
	        System.out.println("Area of the rectangle is: " + area);

	        scanner.close();
	    }
}

