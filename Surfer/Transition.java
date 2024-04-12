public class Transition

{
    public static void main(String args[])
    {
        int n = StdIn.readInt();
        int[][] counts = new int[n][n];
        int[] outDegrees = new int[n];

        while(!StdIn.isEmpty())
        {
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            counts[i][j]++;
            outDegrees[i]++;
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n;  j++)
            {
                double probability = 0.9 * counts[i][j] / outDegrees[i] + 0.1/n;
                StdOut.printf("%8.5f ", probability);
            }
            StdOut.println();
        }
    }
}