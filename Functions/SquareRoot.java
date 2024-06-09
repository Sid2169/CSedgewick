public class SquareRoot
{
    public static double sqrt(double c)
    {
        if ( c >= 0)

        {
           double nextX;
           double x = c; //Initial Guess
           int count = 0; 
           
           while(true)
           {
            nextX = (x + c / x) / 2;
            if (Math.abs(nextX - x) < 1e-10)
            {
                System.out.println(count);
                return nextX;
            }
            else
            {
                count++;
                x = nextX;
            }
           }
        }
        else 
        {
            return Double.NaN;
        }

    }

    public static void main(String[] args)
    {
        System.out.println(sqrt(Double.parseDouble(args[0])));
    }
}