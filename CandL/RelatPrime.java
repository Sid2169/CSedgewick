public class RelatPrime
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.print("  ");
        for(int k = 1; k<=n; k++)
        {System.out.print(k + " ");}
        System.out.println();

        for(int row = 1; row <= n; row++)
        {
            System.out.print(row + " ");
            for(int column = 1; column <= n; column++)
            { 
                if(relativelyPrime(row, column)==true)
                {System.out.print("* ");}

                else
                {System.out.print("  ");}
            }
            System.out.println();
        }
    }



    public static boolean relativelyPrime(int a, int b)
    {
        boolean relPrime = true; 

        if(a<b)
        {
            while (b%a != 0)
            {
                int c = a;
                a = b%a; 
                b = c; 
            }
            if(a==1) {relPrime = true;}
            else {relPrime = false;}
        }

        else
        {
            while(a%b != 0)
            {
                int c = b; 
                b = a%b;
                a = c; 
            }
            if (b == 1) {relPrime = true;}
            else {relPrime = false;}
        }

        return relPrime;
    }
}

