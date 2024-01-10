public class HowMany
{
    public static void main(String[] args)
    {
        int  n = args.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println("You entered " + n + " Command-line-arguments");
    }
}