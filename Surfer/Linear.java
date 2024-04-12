public class Linear
{
    public static void main(String args[])
    {
        int n = StdIn.readInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double sumX = 0.0, sumY = 0.0, sumXY = 0.0, sumXSquare = 0.0;

        while(!StdIn.isEmpty())
        {
            int i = 0;
            x[i] = StdIn.readDouble();
            y[i] = StdIn.readDouble();
            sumX+= x[i];
            sumY+= y[i];
            sumXY+= x[i]*y[i];
            sumXSquare+= x[i]*x[i];
            i++;
        }

        double m = (n*sumXY - sumX*sumY)/(n*sumXSquare - sumX*sumX);
        double b = (sumY - m*sumX)/n;

        System.out.println("Approximate linear model for the given data is y = " + m + "x " + b); 

    }
}

    