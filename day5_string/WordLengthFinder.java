package day5_string;

import java.util.Scanner;

public class WordLengthFinder {
    public static String[] splitWords(String text) {
        StringBuilder word = new StringBuilder();
        java.util.List<String> list = new java.util.ArrayList<>();
        for (int i = 0; i < text.toCharArray().length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    list.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) list.add(word.toString());
        return list.toArray(new String[0]);
    }

    public static int strLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(strLength(words[i]));
        }
        return table;
    }

    public static int[] findMinMax(String[][] table) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIdx = -1, maxIdx = -1;
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{ minIdx, maxIdx };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] mm = findMinMax(table);

        System.out.printf("%-15s %-5s%n", "Word", "Len");
        for (String[] row : table) {
            System.out.printf("%-15s %-5s%n", row[0], row[1]);
        }

        System.out.println("Shortest: " + table[mm[0]][0]);
        System.out.println("Longest: "  + table[mm[1]][0]);
    }
}
