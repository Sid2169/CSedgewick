public class RandomPattern
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for(int j = 0; j < n; j++)
        {System.out.print(j + " ");}
        System.out.println();

        char[][] a = new char[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(Math.random() < 0.5) {a[i][j] = '*';}
                else {a[i][j] = ' ';}
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {System.out.print(a[i][j] + " ");}
            System.out.println(" " + i);
        }
    }
}