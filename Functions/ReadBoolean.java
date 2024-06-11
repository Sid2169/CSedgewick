public class ReadBoolean
{
    public static void main(String[] args)
    {
        Boolean[][] myBool = readBoolean2D();
        int noOfRows = myBool.length;
        int noOfColumns = myBool[0].length;

        for (int i = 0; i < noOfRows; i++)
        {
            for (int j = 0; j < noOfColumns; j++)
            {
                System.out.print(myBool[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static Boolean[][] readBoolean2D()
    {
        System.out.print("Provide number of rows :"); 
        int rows = StdIn.readInt();
        System.out.print("Provide number of columns :");
        int columns = StdIn.readInt();

        Boolean[][] result = new Boolean[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("Provide element [" + i + "][" + j + "] :");
                result[i][j] = StdIn.readBoolean();
            }
        }
        return result;

    }
}