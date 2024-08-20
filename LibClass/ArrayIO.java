package LibClass;

public class ArrayIO
{
    //Read 1-D array
    public static double[] readDouble1D()
    {
        int m = StdIn.readInt();
        double[] a = new double[m];
        for (int i = 0; i < m; i++)
        {
            a[i] = StdIn.readDouble();
        }
        return a;
    }

    //Read 2-D array.
    public static double[][] readDouble2D()
    {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readDouble();
            }
        }
        return a;
    }

    //Print 1-D array
    public static void printArray(double[] a)
    {
        System.out.println(a.length);
        for (int i = 0, m = a.length; i < m; i++)
        {
            System.out.printf("9.5f", a[i]);
        }
    }

    //Print 2-D array
    public static void printArray(double[][] a)
    {
        for (int i = 0, m = a.length; i < m; )
        {
            for (int j = 0, n = a[i].length; j < n; j++)
            {
                System.out.printf("9.5f", a[i][j]);
            }
            System.out.println();
        }
    }

    //Unit test.
    public static void main(String[] args)
    {
        printArray(readDouble2D());
    }
}