package day5_string;
import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static String getComputerChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        return options[new Random().nextInt(3)];
    }

    public static int determineWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return 1;
        return -1;
    }

    public static String[][] calcStats(int wins, int losses, int ties, int total) {
        double winPct = 100.0 * wins / total;
        double compPct = 100.0 * losses / total;
        return new String[][] {
            {"Wins", "Losses", "Ties", "Win% (You)", "Win% (Comp)"},
            {"" + wins, "" + losses, "" + ties,
             String.format("%.2f%%", winPct),
             String.format("%.2f%%", compPct)}
        };
    }

    public static void displayResults(String[] games, String[][] stats) {
        System.out.println("\nGame results:");
        for (String line : games) {
            System.out.println(line);
        }
        System.out.println("\nSummary:");
        for (int i = 0; i < stats.length; i++) {
            for (String cell : stats[i]) {
                System.out.printf("%-12s", cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        sc.nextLine();
        int w = 0, l = 0, t = 0;
        String[] results = new String[rounds];

        for (int i = 0; i < rounds; i++) {
            String user = sc.nextLine();
            String comp = getComputerChoice();
            int res = determineWinner(user, comp);
            if (res > 0) { w++; results[i] = "You: " + user + " | Comp: " + comp + " → You win"; }
            else if (res < 0) { l++; results[i] = "You: " + user + " | Comp: " + comp + " → Computer wins"; }
            else { t++; results[i] = "You: " + user + " | Comp: " + comp + " → Tie"; }
        }
        sc.close();

        int total = w + l + t;
        String[][] stats = calcStats(w, l, t, total);
        displayResults(results, stats);
    }
}
