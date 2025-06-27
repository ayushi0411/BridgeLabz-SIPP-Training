package Day3_Java;

public class Static {
	    public static int add(int a, int b) {
	        return a + b;
	    }
	    public static void main(String[] args) {
	        int sum = Static.add(5, 10);
	        System.out.println("Sum = " + sum); 
	    }
}
