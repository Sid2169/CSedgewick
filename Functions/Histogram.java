public class Histogram
{
    public static void main(String[] args)
    {
        int[] array = new int[args.length];
        for (int i = 0, n = args.length; i < n; i++)
        {
            array[i] = Integer.parseInt(args[i]);
        }

        System.out.print("Provide histogram length :");
        int histoLength = StdIn.readInt();
        array = historgram(array, histoLength);

        for (int i = 0; i < histoLength; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    
    public static int[] historgram(int[] a, int m)
    {
        int[] histo = new int[m];
        for (int i = 0, n = a.length; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[j] == a[i])
                {
                    histo[i]++;
                }
            }
        }
        return histo;
    }
}