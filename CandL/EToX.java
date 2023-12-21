public class EToX
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        System.out.print("e raised to " + x + "= ");

        double term = 1.0; double sum = 0.0;

        for(int n = 1; sum!=sum+term; n++)
        {
            sum+=term;
            for(int i = 1; i<=n; i++)
            {
                term*= x/i;
            }
        }
        System.out.println(sum);
    }
}