public class Mean
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double[] a = new double [n];
        double sum = 0;

        StdOut.println("Please provide double values");
        for (int i = 0; i < n; i++)
        {
            a[i] = StdIn.readDouble();
            sum += a[i];
        }
        double mean = sum/n;
        double sumDeltaSq = 0;

        for (int i = 0; i < n; i++)
        {
            sumDeltaSq += Math.pow((mean-a[i]), 2);
        }

        double standardDeviation = Math.sqrt(sumDeltaSq)/(n-1);

        StdOut.println("Mean = " + mean);
        StdOut.println("Standard Deviation = " + standardDeviation);
    }
}