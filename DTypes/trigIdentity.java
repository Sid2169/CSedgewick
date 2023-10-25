public class trigIdentity
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Math.sin(x)*Math.sin(x) + Math.cos(x)*Math.cos(x);
        System.out.println(y);
        
    }
}