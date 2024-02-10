public class payment
{
    public static void main(String[] args)
    {
        double years = Double.parseDouble(args[0]);
        double principalRemaining = Double.parseDouble(args[1]);
        double interest = Double.parseDouble(args[2]);
        double monthly = 0;
        double monthlyInterest = 0;
        int month = 0;
        double e = 2.171828;

        StdOut.println("Month  Monthly Payment  Monthly Interest  Remaining Principal");
        while(month <= 12*years)
        {
            StdOut.printf("%5d  %15.3f  %16.3f  %19.3f\n", month , monthly , monthlyInterest , principalRemaining);
            
            monthly = principalRemaining*(Math.pow(e, (interest/12)) + (1/(12*years)));
            
            monthlyInterest = principalRemaining*((Math.pow(e, (interest/12))) - 1);
            
            principalRemaining = principalRemaining*((2 - Math.pow(e, (interest/12))) - (1/(12*years)));
            
            month++;

        }
    }
}