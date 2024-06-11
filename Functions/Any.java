public class Any
{
    public static void main(String[] args)
    {
        int n = args.length;
        boolean[] myBool = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            myBool[i] = Boolean.parseBoolean(args[i]);
        }
        System.out.println(any(myBool));
    }

    public static boolean any(boolean[] a)
    {
        for (int i = 0, n = a.length; i < n; i++)
        {
            if (a[i])
              return true;
        }
        return false;
    }
}