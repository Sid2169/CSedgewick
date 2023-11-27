public class Sqrt
{
    public static void main(String[] args)
    {
        double number = Double.parseDouble(args[0]);
        double approxRoot = number/2.0;

        for (int i=1; i<=50; i++)
        {
            approxRoot = (approxRoot/2.0)+(number/(2.0*approxRoot));
        }
        System.out.println(approxRoot);
    }
}