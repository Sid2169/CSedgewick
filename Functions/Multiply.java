public class Multiply
{
    public static void main(String[] args)
    {
        double[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        double[][] c = multiply(a, b);

        for (int i = 0, n = c.length, p = c[0].length; i < n; i++)
        {
            for(int j = 0; j < p; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    
    public static double[][] multiply(double[][] a, double[][] b)
    {
        if (a[0].length == b.length)
        {
            double[][] product = new double[a.length][b[0].length];

            for (int i = 0; i < a.length; i++) 
            {
                for (int k = 0; k < b[0].length; k++) 
                {
                    for (int j = 0; j < a[0].length; j++) 
                    {
                        product[i][k] += a[i][j] * b[j][k];
                    }
                }
            }
            return product;
        }
        else
        {
            throw new IllegalArgumentException("Invalid multiplication");
        }
    }
}