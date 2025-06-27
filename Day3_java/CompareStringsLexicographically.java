package Day3_Java;
import java.util.Scanner;
public class CompareStringsLexicographically {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	        int minLength = Math.min(str1.length(), str2.length());
	        boolean isEqual = true;

	        for (int i = 0; i < minLength; i++) {
	            char ch1 = str1.charAt(i);
	            char ch2 = str2.charAt(i);

	            if (ch1 < ch2) {
	                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
	                isEqual = false;
	                break;
	            } else if (ch1 > ch2) {
	                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
	                isEqual = false;
	                break;
	            }
	        }

	        if (isEqual) {
	            if (str1.length() == str2.length()) {
	                System.out.println("Both strings are equal.");
	            } else if (str1.length() < str2.length()) {
	                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
	            } else {
	                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
	            }
	        }
	    }
}

