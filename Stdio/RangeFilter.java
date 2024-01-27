public class RangeFilter
{
    public static void main(String[] args)
    {
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        while(!StdIn.isEmpty())
        {
            int value = StdIn.readInt();
            if(low <= value && value <= high)
            {System.out.print(value + " ");}
            
            if (StdIn.isEmpty()) break;

        
        }
    }
}