public class PandL
{
    public static void main(String[] args)
    {
        if (args.length != 4)
        {
            System.out.println("Prvode Profit targe, Stoploss, Starting Capital and Number of Trades as command line arguments in this this order");
        }
        double target =  1.0 + Double.parseDouble(args[0]) / 100.0;
        double stopLoss = 1.0 - Double.parseDouble(args[1]) / 100.0;
        double cap = Double.parseDouble(args[2]);
        int noOfTrades = Integer.parseInt(args[3]);
        double sum = cap;

        for (int i = 0; i < noOfTrades; i++)
        {
            if (Math.random() < 0.5)
            {
                double t = sum;
                sum *= stopLoss;
                double l = t - sum;
                System.out.print("\u001B[31mLoss   :"); // Red text
                System.out.printf("%8.2f", l);
                System.out.print("\u001B[0m"); // Reset to default color
            }
            else
            {
                double t = sum;
                sum *= target;
                double p = sum - t;
                System.out.print("\u001B[32mProfit :"); // Green text
                System.out.printf("%8.2f", p);
                System.out.print("\u001B[0m"); // Reset to default color
            }
            System.out.printf("    Current Capital: %10.2f\n", sum); // Print current capital

            if (sum <= 0)
            {
                break;
            }
        }
    }
}