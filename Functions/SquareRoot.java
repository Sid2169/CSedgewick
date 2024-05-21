public class SquareRoot
{
    public static double sqrt(double x)
    {
        if ( x >= 0)

        {
            double approxRoot = x / 2.0;
            for (int i = 0; i < 50; i++)
            {
                approxRoot = (approxRoot / 2.0) + (x / (2.0 * approxRoot));
            }
       
            return approxRoot;
        }
        else 
        {
            return Double.NaN;
        }

    }

    public static void main(String[] args)
    {
        System.out.println(sqrt(Double.parseDouble(args[0])));
    }
}