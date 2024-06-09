public class Signum
{
    public static int signum(int n)
    {
        if ( n < 0)
        {
            return -1;
        }
        else if ( n == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}