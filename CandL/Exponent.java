public class Exponent
{
    public static void main(String[] args)
    {
        double base = Double.parseDouble(args[0]);
        int power = Integer.parseInt(args[1]);

        Double previousPower = base/base;
        int count = 0;
        double result = previousPower;
        
        while (count <= power)
        {
            System.out.println(base + " raised to " +(count) + " = " + (result));
            result = previousPower*base;
            previousPower = result;
            count = count + 1;
        }
    }
}