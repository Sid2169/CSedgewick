public class Polar
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        double radialDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        double polarAngle = Math.atan2(y, x)*(180/Math.PI);

        System.out.println("Radial Distance:" + radialDistance + " , Polar Angle:" + polarAngle + " Degrees");
    }
}