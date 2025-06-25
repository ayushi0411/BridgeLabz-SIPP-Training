package day5_string;
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;  // random 10–99
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            String canVote = (ages[i] >= 18) ? "true" : "false";
            out[i][0] = "" + ages[i];
            out[i][1] = canVote;
        }
        return out;
    }

    public static void displayTable(String[][] table) {
    System.out.printf("%-5s %-10s%n", "Age", "CanVote?");
    for (String[] row : table) {
        System.out.printf("%-5s %-10s%n", row[0], row[1]);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  // number of students
    sc.close();

    int[] ages = generateAges(n);
    String[][] table = checkEligibility(ages);
    displayTable(table);
}
}