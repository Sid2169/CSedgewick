public class NewtonsMethod {

    public static void main(String[] args) {
        double number = 25; // Replace with the positive number you want the square root of
        double sqrtNumber = newtonsMethodSqrt(number);
        System.out.printf("The square root of %.2f is approximately %.5f%n", number, sqrtNumber);
    }

    public static double newtonsMethodSqrt(double x) {
        double tolerance = 1e-10; // Tolerance level
        double y = x > 1 ? x / 2.0 : 1; // Initial guess

        while (true) {
            double nextY = (y + x / y) / 2.0;
            if (Math.abs(nextY - y) < tolerance) {
                break; // Convergence check
            }
            y = nextY;
        }

        return y; // Return the approximated square root
    }
}
