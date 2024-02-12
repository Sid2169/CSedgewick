public class RandomOnetoOne
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        
        for(int i = 0; i < n; i++)
        {
            double x = Math.random()*2 - 1;
            System.out.print(x + " ");
        }
    }
    
}