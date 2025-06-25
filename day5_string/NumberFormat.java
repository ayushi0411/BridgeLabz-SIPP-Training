package day5_string;
import java.util.Scanner;

public class NumberFormat {
    public static void generateNFE(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    public static void handleNFE(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic runtime exception caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        generateNFE(input);
        handleNFE(input);
    }
}
