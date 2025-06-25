package day5_string;
import java.util.Scanner;

public class CharTypeFinder {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String text) {
        int n = text.length();
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkChar(c);
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-3s %-15s%n", "C", "Type");
        for (String[] row : table) {
            System.out.printf("%-3s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[][] table = analyzeString(input);
        displayTable(table);
    }
}
