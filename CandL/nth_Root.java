public class nth_Root
{
    public static void main(String[] args)
    {
        double k = Double.parseDouble(args[0]);
        double n = Double.parseDouble(args[1]);
        double x_not =n;
        
        
        if(k<=0 || n<0) 
        {System.out.println("Invalid input: ith root must be possitive ");}

        else
        {
            for(int i=1; i<=50; i++)
            {
                double y = (Math.pow(x_not, k)-n);
                double y_der= k*(Math.pow(x_not, (k-1)));
                x_not = x_not-(y/y_der);
            }
        
        System.out.println(x_not);
        }

       
    
    }
}