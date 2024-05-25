public class Majority
{
    public static boolean majority(boolean a, boolean b, boolean c)
    {
        return ((a && b) || (b && c) || (a && c));
    } 
}