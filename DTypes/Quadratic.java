public class Quadratic
{
    public static void main(String[] args)
   {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double discriminant = (b*b) - (4.0*a*c);
    double d = Math.sqrt(discriminant);
    System.out.println((-b + d)/ (2.0*a));
    System.out.println((-b - d)/ (2.0*a));
   }
}