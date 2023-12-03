public class PowersOfTwo
{
    public static void main(String[] args)
    {
        //Print first n powers of 2
        int n = Integer.parseInt(args[0]);
        int power = 1;
        for (int i = 0; i<=n; i++)
        {
            //Print powers of 2.
            System.out.println(i + " " + power);
            power = power*2;
        }
    }
}