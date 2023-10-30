public class random
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double c = Math.random();
        if (a<b) 
        {
            System.out.println((int)(a + (Math.abs(c*(a-b)))));
        }
        else if(a>b)
        {
            System.out.println((int)(b + (Math.abs(c*(a-b)))));
        }
        else
        {
            System.out.println("Invalid Input");
        }


    } 
}