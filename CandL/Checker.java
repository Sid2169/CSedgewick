public class Checker
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for(int row = 1; row <= n; row++)
        {
            for(int column = 1; column <= n; column++)
            {
                if ((row+column)%2==0)
                {System.out.print('#');}
                
                else
                {System.out.print(' ');}
            }
            System.out.println();
        }
        System.out.println();
    }
}