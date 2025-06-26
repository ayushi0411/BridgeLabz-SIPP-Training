package Day4_ProgrammingElement;

public class Trigonometric {
	    public static double[] calculateTrigonometricFunctions(double angle) {
	        double r = Math.toRadians(angle);
	        return new double[]{ Math.sin(r), Math.cos(r), Math.tan(r) };
	    }

	    public static void main(String[] args) {
	        double[] res = calculateTrigonometricFunctions(60);
	        System.out.printf("sin=%.6f cos=%.6f tan=%.6f%n", res[0], res[1], res[2]);
	    }
}
