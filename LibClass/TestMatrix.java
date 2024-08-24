package LibClass;

public class TestMatrix
{
    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        double[][] p = StdArrayIO.readDouble2D();
        double[] ranks = new double[p.length];
        ranks[0] = 1.0;
        for (int t = 0; t < trials; t++)
        {
            ranks = Matrix.multiply(ranks, p);
        }
        StdArrayIO.print(ranks);
    }
}