package Day4_ProgrammingElement;
import java.util.Scanner;
public class Springseason {
	    public static boolean isSpringSeason(int m, int d) {
	        if (m < 3 || m > 6) return false;
	        if (m == 3) return d >= 20;
	        if (m == 4 || m == 5) return true;
	        return m == 6 && d <= 20;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int m = s.nextInt(), d = s.nextInt();
	        System.out.println(isSpringSeason(m, d) ? "It's a Spring Season" : "Not a Spring Season");
	        s.close();
	    }
}
