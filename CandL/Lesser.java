public class Lesser
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x%2==0 && y%2==0) 
        {
            if (x<y)
            {System.out.println(x);}
            else if (x>y)
            {System.out.println(y);}
            else 
            {System.out.println("both are equal");}
        }
        else if (x%2!=0 && y%2!=0)
        {
            if(x>y) 
            {System.out.println(x);}
            else if (x<y) 
            {System.out.println(y);}
            else 
            {System.out.println("both are equal");}
            
        }
        else 
        {
            System.out.println("One is odd and the other is even");
        }
        
    }
}