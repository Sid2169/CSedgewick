public class ArrayEquals
{
    public static boolean compareArray(int[] a, int[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(compareArray(a, b));

    }
}