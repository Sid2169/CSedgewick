public class Reverse
{
    public static String[] reverse(String[] a)
    {
        for (int i = 0, n = a.length; i < n / 2; i++)
        {
            String t = a[i];
            a[i] = a[n - i -1];
            a[n - i - 1] = t;
        }
        return a;
    }

    public static void main(String[] args)
    {
        String[] str = reverse(args);
        for (int i = 0, n = str.length; i < n; i++)
        {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
}