public class Sine
{
    public static void main(String[] args)
    {
        double degree = Double.parseDouble(args[0]);
        System.out.print("sin " + degree + " = ");
        double x = degree*(Math.PI/180.0);

        double term = x ;  double sum = 0.0;

        for(int n = 1; sum!= sum+term; n++)
        {
            sum+= term; 
            term*= (-1*x*x)/(2*n+1);
        }
        System.out.println(sum);
    }

}