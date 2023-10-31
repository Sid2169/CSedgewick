public class Compound
{
    public static void main(String[] args)
    {
       double p = Double.parseDouble(args[0]);
       double r = Double.parseDouble(args[1]);
       double t = Double.parseDouble(args[2]);

       double e = Math.exp(1);

       System.out.println(p*(Math.pow(e, r*t)));
    }
}