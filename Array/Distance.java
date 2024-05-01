public class Distance
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        if (args.length != 2 * n + 1)
        {
            System.out.println("arg lenth invalid");
            System.exit(1);
        }

        else
        {
            double[] v1 = new double[n];
            double[] v2 = new double[n];

            double squareSum  = 0;

            for (int i = 0; i < n; i++)
            {
                v1[i] = Double.parseDouble(args[i + 1]);
                v2[i] = Double.parseDouble(args[i + n + 1]);
                squareSum += Math.pow((v1[i] - v2[i]), 2);
            }

            System.out.println("Distance :" + Math.sqrt(squareSum));
            System.exit(0);

        }
                                                                                                                             
    }
}