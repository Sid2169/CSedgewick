public class RelativePrime
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean[][] relPrime = new boolean[n][n];
        
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(i < j)
                {
                    int commonFactor = i; int dividend = j; 
                    while(dividend % commonFactor != 0)
                    {
                        int t = commonFactor;
                        commonFactor = dividend % commonFactor;
                        dividend = t;
                    }
                    if (commonFactor == 1) {relPrime[i][j] = true;}
                    else {relPrime[i][j] = false;}
                }

                else if (j < i)
                {
                    int commonFactor =j; int dividend = i; 
                    while(dividend % commonFactor != 0)
                    {
                        int t = commonFactor;
                        commonFactor = dividend % commonFactor;
                        dividend = t;
                    }
                    if (commonFactor == 1) {relPrime[i][j] = true;}
                    else {relPrime[i][j] = false;}
                }
                else {relPrime[i][j] = false;}
            }
        }

        int row = Integer.parseInt(args[1]);
        int column = Integer.parseInt(args[2]);

        if (relPrime[row][column]) {System.out.println(row + " and " +column + " are relatively prime.");}
        else {System.out.println(row + " and " +column + " are not relatively prime.");}
    }
}