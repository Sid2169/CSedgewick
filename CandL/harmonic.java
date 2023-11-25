public class harmonic
{
    public static void main(String[] args)
    {
        double sumOfNTerms = 0;
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i<=n; i++)
        {
            System.out.print("1/" + i);
            
            if (i < n) 
            {
                System.out.print(" + ");
            } 
            else 
            {
                System.out.print(" = ");
            }
            sumOfNTerms = sumOfNTerms + (1.0 / i);
        }
        System.out.println(sumOfNTerms);
    }
}