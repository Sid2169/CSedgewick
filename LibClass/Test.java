package LibClass;

public class Test
{
    public static void main(String[] args)
    {
        int [] a = {1, 5, 34, 44, 454, 6, 65, 65, 45};
        Sort.bubbleSort(a);
        for (int i = 0, n = a.length; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        
    }
}