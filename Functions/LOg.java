public class LOg
{
    public static double lg(double n)
    {
        if (n <= 0) 
        {
            throw new IllegalArgumentException("Argument must be positive");
        }
        return Math.log(n) / Math.log(2); // Change of base formula
    }

    public static int largestInt(int n)
    {
        if (n <= 0) 
        {
            throw new IllegalArgumentException("Argument must be positive");
        }
        int max = 0;
        while (n >= 2)
        {
            n /= 2;
            max++;
        }
        return max;
    }
}