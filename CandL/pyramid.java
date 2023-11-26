public class pyramid
{
    public static void main(String[] args)
    {
        int height = Integer.parseInt(args[0]); // Hight of pyramid provided by the user.

    for (int row=1; row<=height; row++)//Loop for printing rows.
    {
        for (int column=1; column<=2*height+1; column++)//Loop for printing columns of a row cell by cell.
       {
        if(column<height-row+1 ||column==height+1 || column>height+row+1)
        {
            System.out.print(" "); // Print space for empty cells.
        }
        else
        {
            System.out.print("#"); // Prints '#' for cells forming the pramid.
        }     
       }
       System.out.println(); // Prints a new line for next row.
    }
}
    
}