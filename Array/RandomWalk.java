/*

This program takes command-line arguments n and trials and computes trials self-avoiding walks 
in an n-by-n lattice. For each walk, it creates a boolean array, starts the walk in the center,
 and continues until either a dead end or a boundary is reached. The result of the computation 
 is the percentage of dead ends. Increasing the number of experiments increases the precision. 
 */
public class RandomWalk
{
    public static void main(String[] args)
    {
        //Do trials random self-avoiding random walks in an n-by-n lattice.
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;

        for(int t = 0; t<trials; t++)
        {
            boolean[][] a = new boolean[n][n];
            int x = n/2; int y = n/2;
            while (x>0 && x<n-1 && y>0 && y<n-1)
            {// Check for dead end and make a random move.
                a[x][y]=true; 
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
                {deadEnds++; break;}
                double r = Math.random();
                if(r<0.25) {if(!a[x+1][y]) x++;}
                else if(r<0.50) { if (!a[x-1][y]) x--;}
                else if (r < 0.75) { if (!a[x][y+1]) y++; }
                else if (r < 1.00) { if (!a[x][y-1]) y--; }
            }
        }
        System.out.println(100*deadEnds/trials + "% dead ends");
    }
}