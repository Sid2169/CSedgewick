public class Sort
{
    public static void selectionSort(int[] a)//Selection sort for integer array.
    {
        int n = a.length;

        for (int i = 0; i < n - 1; i++)
        {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }

    public static void selectionSort(double[] a)
    {
        int n = a.length;

        for (int i = 0; i < n - 1; i++)
        {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            double temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }

    public static void bubbleSort(int[] a)
    {
        int n = a.length;

        for (int i = 0; i < n; i++)
        {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }

    public static void bubbleSort(double[] a)
    {
        int n = a.length;

        for (int i = 0; i < n; i++)
        {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}