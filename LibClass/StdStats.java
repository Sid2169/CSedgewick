package LibClass;

public class StdStats
{
    public static double max(double[] a)
    {// Compute maximum value in a[].
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static double min(double[] a)
    {// Compute minimum value in a[].
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static double mean(double[] a)
    {// Compute the average of the values in a[]. 
        double sum = 0.0;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        return sum / n;
    }

    public static double variance(double[] a)
    {// Computes the sample variance of values in a[]
        double average = mean(a);
        double sum = 0.0;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            sum += (a[i] - average) * (a[i] - average);
        }
        return sum / (n - 1);
    }

    public static double stdDev(double[] a)
    {// Computes the standard deviation of values in a[].
        return Math.sqrt(variance(a));
    }

    public static double median(double[] a)
    {// Finds the median of values in[a].
        double[] arr = a.clone();
        int n = a.length;
        Sort.bubbleSort(arr);

        if (n % 2 == 0)
        {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        else
        {
            return arr[n / 2];
        }
    }
    
    
    public static void main(String[] args)
    {
        double[] a = StdArrayIO.readDouble1D();
        StdOut.printf("       min %10.3f\n", min(a));
        StdOut.printf("      mean %10.3f\n", mean(a));
        StdOut.printf("       max %10.3f\n", max(a));
        StdOut.printf("    stddev %10.3f\n", stdDev(a));
        StdOut.printf("       var %10.3f\n", variance(a));
        StdOut.printf("    median %10.3f\n", median(a));
    }
}