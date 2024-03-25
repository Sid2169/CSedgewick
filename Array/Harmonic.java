public class Harmonic

{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        double[] harmonic = new double[n];
        for (int i = 1; i < n; i++)
        {
            harmonic[i] = harmonic[i-1] + 1.0/i;
        }

        for (int i = 0 ; i < harmonic.length; i++)
        {
            System.out.print(harmonic[i] + " ");
        }
        System.out.println();
    }
}