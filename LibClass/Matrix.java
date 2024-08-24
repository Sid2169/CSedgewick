package LibClass;

public class Matrix
{
    public static double dot(double[] a, double[] b) //Vector dot product.
    {
        int n = a.length;
        if (n != b.length)
        {
            throw new IllegalArgumentException("Arrays must be of same length");
        }

        double sum  = 0.0;
        for (int  i = 0; i < n; i++)
        {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static double[][] multiply(double[][] a, double[][] b)// Matrix-matrix product.
    {
        int m = a.length; //Number of rows in  a.
        if (m > 1)//Check if all rows of a are of equal length.
        {
            for (int i = 0; i < m - 1; i++)
            {
                if (a[i].length != a[i + 1].length)
                {
                    throw new IllegalArgumentException("Length of each row of array-a must be equal");
                }
            }
        }
        int n = b[0].length; // Number of columns in  b.
        if (b.length > 1)//Check if all rows of b are of equal length.
        {
            for (int i = 1, k = b.length; i < k; i++)
            {
                if (b[i].length != n)
                {
                    throw new IllegalArgumentException("Length of each row of array-b must be equal");
                }
            }
        }
        if (a[0].length != b.length)//Matrix multiplication is valid if only number columns in a is same as number of rows in b.
        {
            throw new IllegalArgumentException("Number of columns in a must be equal to number of rows in b");
        }

        double[][] product = new double[m][n];
        for (int i = 0; i < m; i++)// Calculate product[i][j] one by one.
        {
            for (int j = 0; j < n; j++)
            {
                product[i][j] = 0.0;
                for (int k = 0, r = a[0].length; k < r; i++)//Here r is the number of columns in a or number of rows in b.
                {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public static double[][] transpose(double[][] a)//Transpose.
    {
        int m = a.length, n = a[0].length;
        
        for ( int i = 1; i < m; i++)//Check if the a is a rectangular or not.
        {
            if (a[i].length != n)
            {
                throw new IllegalArgumentException("All rows of array-a must be of equal length");
            }
        }

        double[][] aTranspose = new double[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                aTranspose[i][j] = a[j][i];
            }
        }
        return aTranspose;
    }

    public static double[] multiply(double[][] a, double[] x)//Matrix-Vector product.
    {
        int m = a.length,  n = a[0].length;
        
        if (x.length != n)//Check if the multiplication of 'a' and x is valid.
        {
            throw new IllegalArgumentException("number of columns in array 'x' must be equal to number of columns in array 'a'.");
        }
        for (int i = 0; i < m;  i++)
        {
            if (a[i].length != n)//Check if 'a' is a rectangular array.
            {
                throw new IllegalArgumentException("All rows  of array 'a' must be of equal length.");
            }
        }

        double[] product = new double[m];
        for (int i = 0; i < m; i++)//Calculate each element of resultant product vector.
        {
            product[i] = dot(a[i], x); 
        }
        return product;
    }

    public static double[] multiply(double[] x, double[][] a)//Vector-Matrix product.
    {
        int n = x.length; // Length of the vector
        int m = a.length; // Number of rows in the matrix
       int p = a[0].length; // Number of columns in the matrix

       // Check if the multiplication of 'x' and 'a' is valid
       if (n != m)
       {
           throw new IllegalArgumentException("Length of vector 'x' must be equal to the number of rows in matrix 'a'.");
       }

       // Check if 'a' is a rectangular matrix
       for (int i = 1; i < m; i++) 
       {
           if (a[i].length != p) 
           {
               throw new IllegalArgumentException("All rows of matrix 'a' must be of equal length.");
           }
       }

    double[] product = new double[p]; // Resulting vector has length equal to number of columns in matrix 'a'
    for (int j = 0; j < p; j++) 
    { // Iterate over columns of matrix 'a'
        product[j] = 0.0; // Initialize element to 0
        for (int i = 0; i < m; i++) 
        { // Iterate over rows of matrix 'a'
            product[j] += x[i] * a[i][j];
        }
    }
    return product;
    }
}    