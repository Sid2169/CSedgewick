public class Scale
{
    public static void scale(double[] a)
    {
        double minimum = Double.MAX_VALUE;
        double maximum = Double.MIN_VALUE;

        for (int i = 0, n = a.length; i < n; i++) //Finding the max element 
        {
            if (a[i] < minimum)
            {
                minimum = a[i];
            }
            if (a[i] > maximum)
            {
                maximum = a[i];
            }
        }

        double maxDifference = maximum - minimum;

        for (int i = 0 , n = a.length; i < n; i++)
        {
            a[i] = a[i] / maxDifference;
        }
    }

    public static void main(String[] args)
    {
        
    }
}