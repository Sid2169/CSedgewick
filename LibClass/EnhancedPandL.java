package LibClass;

public class EnhancedPandL {
    public static void main(String[] args) 
    {
        if (args.length != 6) 
        {
            System.out.println("Provide Profit target, Stoploss, Starting Capital, Number of Trades, Win Rate, and Transaction Cost as command line arguments in this order");
            return;
        }

        double target = 1.0 + Double.parseDouble(args[0]) / 100.0;
        double stopLoss = 1.0 - Double.parseDouble(args[1]) / 100.0;
        double cap = Double.parseDouble(args[2]);
        int noOfTrades = Integer.parseInt(args[3]);
        double winRate = Double.parseDouble(args[4]) / 100.0;
        double transactionCost = Double.parseDouble(args[5]);

        double maxReturn = Double.NEGATIVE_INFINITY;
        double minReturn = Double.POSITIVE_INFINITY;
        double averageReturn = 0.0;

        for (int i = 0; i < 1000; i++) 
        {
            double t = finalSum(target, stopLoss, cap, noOfTrades, winRate, transactionCost);
            averageReturn += t;
            minReturn = Math.min(minReturn, t);
            maxReturn = Math.max(maxReturn, t);
        }

        System.out.println("Minimum Return: " + minReturn);
        System.out.println("Maximum Return: " + maxReturn);
        System.out.println("Average Return: " + averageReturn / 1000);
        System.out.println("Worst Case: " + finalSum(target, stopLoss, cap, noOfTrades, 0.0, transactionCost));
        System.out.println("Best Case: " + finalSum(target, stopLoss, cap, noOfTrades, 1.0, transactionCost));
    }

    public static double finalSum(double target, double stopLoss, double cap, int noOfTrades, double winRate, double transactionCost) 
    {
        double sum = cap;
        for (int i = 0; i < noOfTrades; i++) 
        {
            if (Math.random() <= winRate) 
            {
                sum *= target;
            } 
            else 
            {
                sum *= stopLoss;
            }

            // Apply transaction cost
            sum -= transactionCost;

            if (sum <= 0) 
            {
                break;
            }
        }
        return sum;
    }
}
