package LibClass;

public class  TestStats
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double[] dAry = new double[n];
        for (int i = 0; i < n; i++)
        {
            dAry[i] = StdRandom.uniformDouble(-100000, 100000);
        }
        StdArrayIO.print(dAry);
        System.out.println(StdStats.mean(dAry));
        System.out.println(StdStats.variance(dAry));
        System.out.println(StdStats.stdDev(dAry));

    }
}