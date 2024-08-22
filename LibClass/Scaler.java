package LibClass;

public class Scaler
{
    public static void scale(double ymin, double ymax, double[] a)
    {
        if (ymin >= ymax)
        {
            System.out.println("ymax must be greater than ymin");
            return;
        }

        double arrLow = StdStats.min(a);
        double arrayRange = StdStats.max(a) - arrLow;
        double newRange = ymax - ymin; 
        for (int i = 0, n = a.length; i < n; i++)
        {
            a[i] = (newRange / arrayRange) * (a[i] - arrLow) + ymin;
        }
    }

    public static void main(String[] args)
    {
        double ymin = StdIn.readDouble();
        double ymax = StdIn.readDouble();
        
        double[] a = StdIn.readAllDoubles();
        scale(ymin, ymax, a);

        for (int i = 0, n = a.length; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}