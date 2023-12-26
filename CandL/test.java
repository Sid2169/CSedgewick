public class test
{
    public static void main(String[] args)
    {
       double degree = Double.parseDouble(args[0]);
        System.out.print("sin " + degree + " = ");
        double x = degree * (Math.PI / 180.0);

        double term = x;
        double sum = term;
       
       for (int n = 1; sum != sum+term; n++)
       {
          term *= (-1 * x * x) / ((2 * n) * (2 * n + 1));
            sum += term;
       }

        System.out.println(sum);
    }
}