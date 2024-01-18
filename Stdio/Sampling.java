public class Sampling
{
    public static void main(String[] args)
    {
        StdOut.print("Provide interval : ");
        StdOut.print("\nWhat is lower bound? ");
        double lo = StdIn.readDouble();
        StdOut.print("\nWhat is upper bound? ");
        double hi = StdIn.readDouble();
        StdOut.print("\nWhat is sample size? ");
        int n = StdIn.readInt();

        double[] x = new double[n+1];
        double[] y = new double[n+1];

        for (int i = 0; i <= n; i++) x[i] = (hi-lo)*i/n;
        for (int i = 0; i <= n; i++) y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);

        StdDraw.setXscale(lo, hi);
        StdDraw.setYscale(-2.0, 2.0);
        StdDraw.line(x[0], 0.0, x[n], 0.0);

        for (int i = 0; i <= n-1; i++)
        {StdDraw.line(x[i], y[i], x[i+1], y[i+1]);}

       
    }
}