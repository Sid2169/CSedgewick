public class Butterfly
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);

        int row = 1; 
        while (row <= n)
        {
            for (int column = 1; column <= 2*n; column++)
            {
                if (column <= row || column >= 2*n - row + 1) 
                System.out.print('*');
                else System.out.print(' ');
            }
            row++;
            System.out.println();
        } 

        row = n;
        while (row >= 1)
        {
            for (int column = 1; column <= 2*n; column++)
            {
                if (column <= row || column >= 2*n - row + 1)
                System.out.print('*');
                else System.out.print(' ');
            }
            row--;
            System.out.println();
        }
    }
}