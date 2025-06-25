package day5_string;
import java.util.Scanner;

public class StringIndex {
    public static void generateSIOB(String s, int index) {
        System.out.println(s.charAt(index));
    }

    public static void handleSIOB(String s, int index) {
        try {
            System.out.println(s.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int idx = sc.nextInt();
        sc.close();

        generateSIOB(input, idx);
        handleSIOB(input, idx);
    }
}
