public class pyramid
{
    public static void main(String[] args)
    {
        int hight = Integer.parseInt(args[0]); // Hight of pyramid provided by the user.

    for (int row=1; row<=hight; row++)
    {
        for (int column=1; column<=2*hight+1; column++)
       {
        if(column<=hight-row ||column==hight+1 || column>hight+row+1)
        {
            System.out.print(" ");
        }
        else
        {
            System.out.print("#");
        }     
       }
       System.out.println();
    }
}
    
}