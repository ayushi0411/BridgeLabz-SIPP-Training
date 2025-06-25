package day5_string;
import java.util.Scanner;

public class NullPointer {
    public static void generateNPE() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNPE() {
        String text = null;
        try {
            System.out.println(text.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        if (choice == 1) generateNPE();
        else handleNPE();
    }
}

