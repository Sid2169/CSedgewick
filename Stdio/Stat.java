public class Stat
{
    public static void main(String[] args)
    {
        int n = 0;
        double logSum = 0.0;
        double invSum = 0.0;
        
        while(!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            logSum+= Math.log(x);
            invSum+= (1/x);
            n++;
        }

        double geometricMean = Math.exp(logSum/n);
        double harmonicMean = n/invSum;

        StdOut.println("Geometric Mean = " + geometricMean);
        StdOut.println("Harmonic Mean = " + harmonicMean);

    }
}