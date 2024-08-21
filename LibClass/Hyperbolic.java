package LibClass;

public class Hyperbolic
{
    public static double sinh(double x)
    {// Computes the value of  sinh(x).
        return (Math.exp(x) - Math.exp(-x)) / 2;
    }

    public static double cosh(double x)
    {// computes the value of cosh(x).
        return (Math.exp(x) + Math.exp(-x)) / 2;
    }

    public static double tanh(double x)
    {// Computes the value of tanh(x).
        return sinh(x) / cosh(x);
    }

    public static double coth(double x)
    {// Computes the value of coth(x).
        return cosh(x) / sinh(x);
    }

    public static double sech(double x)
    {// Computes the value of sech(x).
        return 1 / cosh(x);
    }

    public static double csch(double x)
    {// Computes the value of csch(x).
        return 1 / sinh(x);
    }

    public static void main(String[] args)
    {
        System.out.println(sinh(Double.parseDouble(args[0])));
        System.out.println(cosh(Double.parseDouble(args[0])));
        System.out.println(tanh(Double.parseDouble(args[0])));
        System.out.println(coth(Double.parseDouble(args[0])));
        System.out.println(sech(Double.parseDouble(args[0])));
        System.out.println(csch(Double.parseDouble(args[0])));
    }
}