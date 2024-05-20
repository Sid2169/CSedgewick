public class ArrayEquals
{
    public static boolean compareArray(int[] a, int[] b)
    {
        boolean result = false;
        if (a.length == b.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] != b[i])
                {
                    return result;
                }
            }
            result = true;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(compareArray(a, b));

    }
}