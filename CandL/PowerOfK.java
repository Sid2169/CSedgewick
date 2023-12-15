public class PowerOfK
{
    public static void main(String[] args)
    {
        long k = Long.parseLong(args[0]);
        long power = 1; 

        for(int i = 0; power <= Long.MAX_VALUE/k; i++)
        {
            System.out.println(k + " raised to " + i + " = " + power);
            power = power*k;
        }
    }
}