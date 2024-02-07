public class Missing
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[] missing = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            missing[i] = true;
        }

        StdOut.print("These are missing values - ");

        while(!StdIn.isEmpty())
        {
            int value = StdIn.readInt();
            for(int i = 0; i < n; i++)
            {
                if(value == i)
                {missing[i] = false; break;}

            }  
        }
        
        
        for(int i = 1; i < n; i++)
        {
            if(missing[i])
            {StdOut.print(i + " ");}
        }
   
    }
    
}