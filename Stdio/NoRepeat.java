public class NoRepeat
{
    public static void main(String[] args)
    {
        
        
        int[] a = StdIn.readAllInts();
        for(int i = 0; i < a.length; i++)
        {
            boolean noMatch = true;
            for( int j = 0; j < i; j++)
            {
               if (a[i] == a[j])
               {
                noMatch = false; 
                break;
               }
            }
            if(noMatch)
            System.out.print(a[i] + " ");
        }
    }
}

