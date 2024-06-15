public class Stars 
{

    public static void main(String[] args) 
    {
        // Parse command-line arguments
        double d1 = Math.toRadians(Double.parseDouble(args[0])); // Declination of star 1
        double a1 = Math.toRadians(Double.parseDouble(args[1])); // Right ascension of star 1
        double d2 = Math.toRadians(Double.parseDouble(args[2])); // Declination of star 2
        double a2 = Math.toRadians(Double.parseDouble(args[3])); // Right ascension of star 2

        // Calculate differences
        double d = d2 - d1;
        double a = a2 - a1;

        // Calculate angle subtended using the given formula
        double angle = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(d / 2), 2) + Math.cos(d1) * Math.cos(d2) * Math.pow(Math.sin(a / 2), 2)));

        // Convert result to degrees
        angle = Math.toDegrees(angle);

        System.out.println("The angle subtended by the two stars is: " + angle + " degrees");
    }
}
