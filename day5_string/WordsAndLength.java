package day5_string;
import java.util.Scanner;

public class WordsAndLength {
    public static String[] splitWords(String text) {
        java.util.List<String> list = new java.util.ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) list.add(sb.toString());
        return list.toArray(new String[0]);
    }

    public static int strLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(strLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        String[] words = splitWords(line);
        String[][] table = wordsWithLengths(words);

        System.out.printf("%-10s %5s%n", "Word", "Length");
        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            System.out.printf("%-10s %5d%n", row[0], len);
        }
    }
}
