/*1.5.18 Write a program that takes an integer command-line argument n and plots an n-by-n checkerboard with red and black squares. Color the lower-left square red.

 */
public class Checkered18
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setYscale(0, n);
        StdDraw.setYscale(0, n);

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if((i+j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else               StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledSquare(i+0.5, j+0.5, 0.5);
            }
        }
    }
}