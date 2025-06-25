package day5_string;
import java.util.*;

public class SplitCompare {
    public static int strLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    public static String[] manualSplit(String text) {
        List<Integer> spaces = new ArrayList<>();
        int n = strLength(text);
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') spaces.add(i);
        }
        int words = spaces.size() + 1;
        String[] arr = new String[words];
        int start = 0;
        for (int i = 0; i < spaces.size(); i++) {
            int end = spaces.get(i);
            arr[i] = text.substring(start, end);
            start = end + 1;
        }
        arr[words - 1] = text.substring(start, n);
        return arr;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        String[] manual = manualSplit(line);
        String[] builtin = line.split(" ");

        System.out.println("Manual split: " + Arrays.toString(manual));
        System.out.println("Built‑in split: " + Arrays.toString(builtin));
        System.out.println("Match? " + compareArrays(manual, builtin));
    }
}


