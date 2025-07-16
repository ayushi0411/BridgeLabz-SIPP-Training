package Day1_Programs;
import java.util.Scanner;
public class StudentScore {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter no. of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score of student: ");
            int score = sc.nextInt();
            if (score < 0) {
                System.out.println("Failed! Try again.");
                i--;
                continue;
            }
            scores[i] = score;
            total += score;
        }
        int highest = scores[0];
        int lowest = scores[0];
        double average = total /(double) n;
        for (int i = 0; i < n; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Scores above average:");
        for (int i = 0; i < n;i++) {
            if (scores[i] > average) {
                System.out.println(scores[i]);
            }
        }
	}
}
