public class Pow_two
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        int powerOfTwo = 1;
        while(powerOfTwo<=n/2)
        {
            powerOfTwo=powerOfTwo*2;
            System.out.println(powerOfTwo);
        }
        
    }
}