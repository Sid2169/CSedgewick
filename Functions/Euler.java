public class Euler
{
    public static void main(String[] args)
    {
        System.out.println(eulerTotientFunction(Integer.parseInt(args[0])));
    }
    
    public static int hcf(int a, int b)//Calculates the highest common factor of two integers;
    {
        int divisor, dividend, highestCommonFactor = 0;

        if (a < b)
        {
            divisor = a; dividend = b;
        }
        else if (a > b)
        {
            divisor = b; dividend = a;
        }
        else
        {
            return a;
        }

        while (divisor != 0)
            {
                highestCommonFactor = divisor;
                divisor = dividend % divisor;
                dividend = highestCommonFactor;
            }
        return highestCommonFactor;
    }

    public static int eulerTotientFunction(int n)//Calculater the euler totiont function.
    {
        int eulerTotient = 0;
        for (int i = 1; i < n; i++)
        {
            if (hcf(i, n) == 1)
            {
                eulerTotient++;
            }
        }
        return eulerTotient;
    }
}