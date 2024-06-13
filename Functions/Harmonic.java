public class Harmonic
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        if ( n <= 0)
        {
            System.out.println("Harmonic sum is not defined for negative values and zero ");
        }
        else
        {
            System.out.println(harmonic(n));
        }
    }
    
    public static double harmonic(int n)
    {
        if (n < 100)
        {
            return harmonicSmall(n);
        }
        else return harmonicLarge(n);
    }

    public static double harmonicSmall(int n)// Calculate the the nth harmonic for n < 100.
    {
        double harmonic = 0.0;
        for (int i = 1; i <= n; i++)
        {
            harmonic += (1.0 / i);
        }
        return harmonic;
    }

    public static double harmonicLarge(int n)//Calculate the nth harmonic for n >= 100.
    {
        double lambda = 0.577215664901532;
        return Math.log(n) + lambda + (1 /(2 * n)) - (1 / (12 * Math.pow(n, 2))) + (1 / (120 * Math.pow(n, 4)));
    }
}