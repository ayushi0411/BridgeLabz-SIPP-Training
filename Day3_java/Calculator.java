package Day3_Java;
import java.util.Scanner;
public class Calculator {
	   public static void main(String args[]) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a: ");
	     int a = sc.nextInt();
	     System.out.print("Enter b: ");
	     int b = sc.nextInt();
	     System.out.println();
	     int button = sc.nextInt();
	     switch (button) {
	         case 1:
	    	     System.out.println("Sum = " + (a + b));
	    	     break;
	         case 2:
	    	     System.out.println("Diff = " + (a - b));
	    	     break;
	         case 3:
	        	 System.out.println("Multiply = " + (a * b));
	        	 break;
	         case 4:
	        	 System.out.println("Div = " + (a / b));
	        	 break;
	        	 default:
	        		 System.out.println("Invalid");
	   }
   }
}