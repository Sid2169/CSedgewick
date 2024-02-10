public class TenPerLine
{
    public static void main(String[] args)
    {
        while(!StdIn.isEmpty())
        {
            for(int i = 0; i < 10; i++)
            {
                int value = StdIn.readInt();
                StdOut.printf("%3d " ,value);
                if(StdIn.isEmpty()) break;
            }
        }    
            StdOut.println();

    }
}