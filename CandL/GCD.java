public class GCD
{
    public static void main(String [] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a<b)
        {
            while (b%a !=0)
            {
                int c = a; 
                a = b%a;
                b = c;
            }
            System.out.println(a);
        }
        else
        {
            while (a%b!=0)
            {
                int c = b;
                b = a % b;
                a = c; 
            }
            System.out.println(b);
        }
    }
}