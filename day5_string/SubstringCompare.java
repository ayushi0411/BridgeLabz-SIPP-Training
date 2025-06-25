package day5_string;
import java.util.Scanner;

public class SubstringCompare {
    public static String manualSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Start index: ");
        int start = sc.nextInt();
        System.out.print("End index: ");
        int end = sc.nextInt();
        sc.close();

        String manual = manualSubstring(text, start, end);
        String builtIn = text.substring(start, end);
        boolean manualEqual = compareStrings(manual, builtIn);
        boolean equalsEqual = manual.equals(builtIn);

        System.out.println("Manual:   " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("charAt compare: " + manualEqual);
        System.out.println("equals():       " + equalsEqual);
        System.out.println((manualEqual && equalsEqual)
            ? "✅ Both substrings match" 
            : "⚠️ Substrings differ!");
    }
}
