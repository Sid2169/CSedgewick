public class QuRegression {

    public static void main(String[] args) {
        // Example data points (x, y)
        double[] xValues = {0.0, 230.0, 460.0, 1150.0, 1725.0, 2070.0, 2300.0};
        double[] yValues = {0.0, 0.01, 0.018, 0.03, 0.022, 0.01, 0.0};

        // Calculate the coefficients
        double[] coefficients = calculateQuadraticCoefficients(xValues, yValues);

        // Display the coefficients
        System.out.println("Quadratic Regression Coefficients:");
        System.out.println("a (coefficient of x^2): " + coefficients[0]);
        System.out.println("b (coefficient of x): " + coefficients[1]);
        System.out.println("c (constant term): " + coefficients[2]);

        // Print the quadratic regression equation
        System.out.println("\nQuadratic Regression Equation:");
        System.out.println("y = " + coefficients[0] + "x^2 + " + coefficients[1] + "x + " + coefficients[2]);
    }

    public static double[] calculateQuadraticCoefficients(double[] xValues, double[] yValues) {
        double[] coefficients = new double[3]; // a, b, c

        // Calculate the Lagrange coefficients
        double x1 = xValues[0];
        double x2 = xValues[1];
        double x3 = xValues[2];

        double y1 = yValues[0];
        double y2 = yValues[1];
        double y3 = yValues[2];

        coefficients[0] = Math.abs(((x2 - x3) * y1 + (x3 - x1) * y2 + (x1 - x2) * y3) /
        ((x1 - x2) * (x1 - x3) * (x2 - x3)));
        coefficients[1] = Math.abs(((x2 * x2 - x3 * x3) * y1 + (x3 * x3 - x1 * x1) * y2 + (x1 * x1 - x2 * x2) * y3) /
        ((x1 - x2) * (x1 - x3) * (x2 - x3)));
        coefficients[2] = y1 - coefficients[0] * x1 * x1 - coefficients[1] * x1;

        return coefficients;
    }
}