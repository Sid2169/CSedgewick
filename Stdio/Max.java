public class Max
{
    public static void main(String[] args)
    {
        System.out.println("Provide possitive Integers");
        int max = StdIn.readInt();
        

        while(!StdIn.isEmpty())
        {
            int x = StdIn.readInt();
            if(x < 0) StdOut.println("Please provide only possitive values");
            else if( x > max) max = x;   
        }
        StdOut.println("The maximum value is = " + max);
    }
}