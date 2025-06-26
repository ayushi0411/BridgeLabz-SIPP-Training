package Day4_ProgrammingElement;
import java.util.Scanner;

public class CheckNumber {
	    public static int check(int n) {
	        return n > 0 ? 1 : n < 0 ? -1 : 0;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int res = check(n);
	        System.out.println(res == 1 ? "positive" : res == -1 ? "negative" : "zero");
	        sc.close();
	    }
}

