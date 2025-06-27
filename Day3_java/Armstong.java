package Day3_Java;
public class Armstong {
       public static void main(String[] args) {
	 System.out.print("Armstrong no. from 1 to 1000: ");
	  for (int i = 1; i <= 1000; i++) {
	 int sum = 0, n = i;
	    while (n > 0) {
	     int digit = n % 10;
	     sum += digit * digit * digit; 
	       n /= 10;
	  }
	    if (sum == i) {
	   System.out.print(i+"");
	      }
	    }
	}
}
